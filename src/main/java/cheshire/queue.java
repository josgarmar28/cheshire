package cheshire;

import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

class queue {

	private static boolean sq_ring_needs_enter(MemorySegment ring, int submit, MemorySegment flags) {
		if (submit == 0) {
			return false;
		}

		int ring_flags = io_uring.getFlags(ring);
		if ((ring_flags & constants.IORING_SETUP_SQPOLL) == 0) {
			return true;
		}

		// io_uring_smp_mb(); // TODO: Review
		// std::atomic_thread_fence(std::memory_order_seq_cst);

		MemorySegment sq = io_uring.getSqSegment(ring);
		// TODO: Review inside if -> uring_unlikely(IO_URING_READ_ONCE(kflags)
		long kflags = io_uring_sq.getAcquireKflags(sq);
		if ((kflags & constants.IORING_SQ_NEED_WAKEUP) != 0) {
			flags.set(ValueLayout.JAVA_INT, 0L, (flags.get(ValueLayout.JAVA_INT, 0L) | constants.IORING_ENTER_SQ_WAKEUP));
			return true;
		}

		return false;
	};

	private static int _io_uring_get_cqe(io_uring ring, MemorySegment cqe_ptr, MemorySegment data,
			MemorySegment cqe, MemorySegment nr_available, MemorySegment flags) {
		boolean looped = false;
		int err = 0;

		do {
			boolean need_enter = false;
			flags.set(ValueLayout.JAVA_INT, 0L, 0);
			int ret;

			int wait_nr = get_data.getWaitNr(data);
			int submit = get_data.getSubmit(data);
			boolean has_ts = get_data.getHasTs(data);
			long sz = get_data.getSz(data);

			// TODO: Review pointers
			ret = liburing.__io_uring_peek_cqe(ring, cqe, nr_available, cqe);
			if (ret != 0) {
				if (err == 0) {
					err = ret;
				}
				break;
			}
			if (cqe == null && wait_nr == 0 && submit == 0) {
				if (looped || !cq_ring_needs_enter(ring.segment)) {
					if (err == 0) {
						err = -constants.EAGAIN;
					}
					break;
				}
				need_enter = true;
			}
			if ((wait_nr > nr_available.get(ValueLayout.JAVA_INT, 0L)) || need_enter) {
				int get_flags = get_data.getGetFlags(data);
				flags.set(ValueLayout.JAVA_INT, 0L, constants.IORING_ENTER_GETEVENTS | get_flags);
				need_enter = true;
			}
			if (sq_ring_needs_enter(ring.segment, submit, flags)) {
				need_enter = true;
			}
			if (!need_enter) {
				break;
			}
			MemorySegment arg = MemorySegment.ofAddress(get_data.getArg(data));
			if (looped && has_ts) {
				// TODO: Review
				// struct io_uring_getevents_arg *arg = data->arg;
				if (cqe == null && arg != MemorySegment.NULL && err == 0) {
					err = -constants.ETIME;
				}
				break;
			}

			char int_flags = io_uring.getIntFlags(ring.segment);
			if ((int_flags & constants.INT_FLAG_REG_RING) != 0) {
				flags.set(ValueLayout.JAVA_INT, 0L,
						flags.get(ValueLayout.JAVA_INT, 0L) | constants.IORING_ENTER_REGISTERED_RING);
			}
			int enter_ring_fd = io_uring.getEnterRingFd(ring.segment);
			ret = syscall.__sys_io_uring_enter2(enter_ring_fd, submit, wait_nr, flags.get(ValueLayout.JAVA_INT, 0L), arg, sz);
			if (ret < 0) {
				if (err == 0) {
					err = ret;
				}
				break;
			}

			get_data.setSubmit(data, get_data.getSubmit(data) - ret);
			// TODO check if it would be better to use isLoaded || isMapped from
			// MemorySegment
			if (cqe != null) {
				break;
			}
			if (!looped) {
				looped = true;
				err = ret;
			}
		} while (true);

		// *cqe_ptr = cqe;
		cqe_ptr.copyFrom(cqe);
		return err;
	}

	private static int __io_uring_get_cqe(io_uring ring, MemorySegment cqe_ptr, int submit, int wait_nr,
			MemorySegment sigmask, MemorySegment data, MemorySegment cqe, MemorySegment nr_available, MemorySegment flags) {
		get_data.setSubmit(data, submit);
		get_data.setWaitNr(data, wait_nr);
		get_data.setGetFlags(data, 0);
		get_data.setSz(data, constants._NSIG / 8);
		get_data.setArg(data, sigmask.address()); // TODO: Review
		return _io_uring_get_cqe(ring, cqe_ptr, data, cqe, nr_available, flags);
	};

	private static int io_uring_get_events(MemorySegment ring) {
		int flags = constants.IORING_ENTER_GETEVENTS;

		char int_flags = io_uring.getIntFlags(ring);
		if ((int_flags & constants.INT_FLAG_REG_RING) != 0) {
			flags |= constants.IORING_ENTER_REGISTERED_RING;
		}
		int enter_ring_fd = io_uring.getEnterRingFd(ring);

		return syscall.__sys_io_uring_enter(enter_ring_fd, 0, 0, flags, null);
	}

	private static int __io_uring_flush_sq(MemorySegment ring) {
		MemorySegment sq = io_uring.getSqSegment(ring);
		int tail = io_uring_sq.getSqeTail(sq);
		int head = io_uring_sq.getSqeHead(sq);
		if (head != tail) {
			io_uring_sq.setSqeHead(sq, tail);

			int flags = io_uring.getFlags(ring);
			if ((flags & constants.IORING_SETUP_SQPOLL) == 0) {
				// *sq->ktail = tail;
				io_uring_sq.setKtail(sq, tail);
			} else {
				// io_uring_smp_store_release(sq->ktail, tail);
				io_uring_sq.setReleaseKtail(sq, tail);
			}
		}
		// return tail - IO_URING_READ_ONCE(*sq->khead);
		return tail - (int) io_uring_sq.getAcquireKhead(sq);
	};

	private static boolean cq_ring_needs_flush(MemorySegment ring) {
		MemorySegment sq = io_uring.getSqSegment(ring);
		// IO_URING_READ_ONCE(*ring->sq.kflags) // TODO: std::memory_order_relaxed
		// TODO: Get content or address
		long kflags = io_uring_sq.getAcquireKflags(sq);
		return ((kflags & (constants.IORING_SQ_CQ_OVERFLOW | constants.IORING_SQ_TASKRUN)) != 0);
	};

	private static boolean cq_ring_needs_enter(MemorySegment ring) {
		int flags = io_uring.getFlags(ring);
		return ((flags & constants.IORING_SETUP_IOPOLL) != 0) || cq_ring_needs_flush(ring);
	};

	private static int io_uring_wait_cqes_new(io_uring ring, MemorySegment cqe_ptr, int wait_nr, MemorySegment ts,
			MemorySegment sigmask, MemorySegment arg, MemorySegment data, MemorySegment cqe, MemorySegment nr_available,
			MemorySegment flags) {
		// TODO: Review sigset_t *sigmask -> .sigmask = (unsigned long) sigmask,
		io_uring_getevents_arg.setSigmask(arg, sigmask.address());
		io_uring_getevents_arg.setSigmaskSz(arg, constants._NSIG / 8);
		// TODO: Same as above for ts
		io_uring_getevents_arg.setTs(arg, ts.address());

		get_data.setWaitNr(data, wait_nr);
		get_data.setGetFlags(data, constants.IORING_ENTER_EXT_ARG);
		get_data.setSz(data, arg.byteSize());
		get_data.setHasTs(data, ts != MemorySegment.NULL);
		// TODO: .arg = &arg
		get_data.setArg(data, arg.address());

		return _io_uring_get_cqe(ring, cqe_ptr, data, cqe, nr_available, flags);

	};

	private static int __io_uring_submit_timeout(io_uring ring, int wait_nr, MemorySegment ts, io_uring_sqe sqe) {
		int ret;
		// TODO: Review allocation logic of sqe
		MemorySegment resSqe = liburing.io_uring_get_sqe(ring, sqe);
		if (resSqe == null) {
			ret = liburing.io_uring_submit(ring);
			if (ret < 0) {
				return ret;
			}
			resSqe = liburing.io_uring_get_sqe(ring, sqe);
			if (resSqe == null) {
				return -constants.EAGAIN;
			}
		}
		liburing.io_uring_prep_timeout(sqe, ts, wait_nr, 0);
		io_uring_sqe.setUserData(resSqe, constants.LIBURING_UDATA_TIMEOUT);
		return __io_uring_flush_sq(ring.segment);
	};

	private static int __io_uring_submit(MemorySegment ring, int submitted, int wait_nr, boolean getevents,
			MemorySegment flags) {
		boolean cq_needs_enter = getevents || wait_nr != 0 || cq_ring_needs_enter(ring);
		int ret;

		flags.set(ValueLayout.JAVA_INT, 0L, (flags.get(ValueLayout.JAVA_INT, 0L) | constants.IORING_ENTER_SQ_WAKEUP));
		if (sq_ring_needs_enter(ring, submitted, flags) || cq_needs_enter) {
			if (cq_needs_enter) {
				flags.set(ValueLayout.JAVA_INT, 0L,
						((int) flags.get(ValueLayout.JAVA_INT, 0L)) | constants.IORING_ENTER_GETEVENTS);
			}
			char int_flags = io_uring.getIntFlags(ring);
			if ((int_flags & constants.INT_FLAG_REG_RING) != 0) {
				flags.set(ValueLayout.JAVA_INT, 0L,
						((int) flags.get(ValueLayout.JAVA_INT, 0L)) | constants.IORING_ENTER_REGISTERED_RING);
			}

			int enter_ring_fd = io_uring.getEnterRingFd(ring);
			ret = syscall.__sys_io_uring_enter(enter_ring_fd, submitted, wait_nr, (int) flags.get(ValueLayout.JAVA_INT, 0L),
					null);
		} else {
			ret = submitted;
		}
		return ret;
	};

	public static int io_uring_submit_and_wait_timeout(io_uring ring, MemorySegment cqe_ptr, int wait_nr,
			MemorySegment ts, MemorySegment sigmask, MemorySegment arg, MemorySegment data, io_uring_sqe sqe,
			MemorySegment cqe, MemorySegment nr_available, MemorySegment flags) {
		int to_submit;
		if (ts != null) {
			int features = io_uring.getFeatures(ring.segment);
			if ((features & constants.IORING_FEAT_EXT_ARG) != 0) {
				// TODO: Review sigset_t *sigmask -> .sigmask = (unsigned long) sigmask,
				io_uring_getevents_arg.setSigmask(arg, sigmask.address());
				io_uring_getevents_arg.setSigmaskSz(arg, constants._NSIG / 8);
				// TODO: Same as above for ts
				io_uring_getevents_arg.setTs(arg, ts.address());

				get_data.setSubmit(data, __io_uring_flush_sq(ring.segment));
				get_data.setWaitNr(data, wait_nr);
				get_data.setGetFlags(data, constants.IORING_ENTER_EXT_ARG);
				get_data.setSz(data, arg.byteSize());
				get_data.setHasTs(data, ts != MemorySegment.NULL);
				get_data.setArg(data, arg.address());

				return _io_uring_get_cqe(ring, cqe_ptr, data, cqe, nr_available, flags);
			}
			to_submit = __io_uring_submit_timeout(ring, wait_nr, ts, sqe);
			if (to_submit < 0) {
				return to_submit;
			}
		} else {
			to_submit = __io_uring_flush_sq(ring.segment);
		}
		return __io_uring_get_cqe(ring, cqe_ptr, to_submit, wait_nr, sigmask, data, cqe, nr_available, flags);
	};

	public static int __io_uring_submit_and_wait(MemorySegment ring, int wait_nr, MemorySegment flags) {
		return __io_uring_submit(ring, __io_uring_flush_sq(ring), wait_nr, false, flags);
	};

	public static int io_uring_wait_cqes(io_uring ring, MemorySegment cqe_ptr, int wait_nr, MemorySegment ts,
			MemorySegment sigmask, io_uring_sqe sqe, MemorySegment arg, MemorySegment data, MemorySegment cqe,
			MemorySegment nr_available, MemorySegment flags) {
		int to_submit = 0;

		if (ts != null) {
			int features = io_uring.getFeatures(ring.segment);
			if ((features & constants.IORING_FEAT_EXT_ARG) != 0) {
				return io_uring_wait_cqes_new(ring, cqe_ptr, wait_nr, ts, sigmask, arg, data, cqe, nr_available, flags);
			}
			to_submit = __io_uring_submit_timeout(ring, wait_nr, ts, sqe);
			if (to_submit < 0) {
				return to_submit;
			}
		}

		return __io_uring_get_cqe(ring, cqe_ptr, to_submit, wait_nr, sigmask, data, cqe, nr_available, flags);
	};

	public static int io_uring_peek_batch_cqe(io_uring ring, MemorySegment cqes, int count) {
		int ready;
		boolean overflow_checked = false;
		int shift = 0;

		int ring_flags = io_uring.getFlags(ring.segment);
		if ((ring_flags & constants.IORING_SETUP_CQE32) != 0) {
			shift = 1;
		}

		while (true) { // TODO: Review logic
			ready = liburing.io_uring_cq_ready(ring);
			if (ready != 0) {
				MemorySegment cq = io_uring.getCqSegment(ring.segment);
				// unsigned head = *ring->cq.khead;
				int head = MemorySegment.ofAddress(io_uring_cq.getKhead(cq)).get(ValueLayout.JAVA_INT, 0); // TODO: Get content?
				int mask = io_uring_cq.getRingMask(cq);
				int last;

				count = count > ready ? ready : count;
				last = head + count;
				for (int i = 0; head != last; head++, i++) {
					// cqes[i] = &ring->cq.cqes[(head & mask) << shift];
					cqes.setAtIndex(ValueLayout.ADDRESS, i, cq.getAtIndex(ValueLayout.ADDRESS, (head & mask) << shift));
				}
				return count;
			}

			if (overflow_checked) {
				return 0;
			}

			if (cq_ring_needs_flush(ring.segment)) {
				io_uring_get_events(ring.segment);
				overflow_checked = true;
				// goto again;
				continue;
			}
			return 0;
		}
	};

}
