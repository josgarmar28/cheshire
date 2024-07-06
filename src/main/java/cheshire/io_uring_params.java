package cheshire;

import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.VarHandle;

public final class io_uring_params {
	MemorySegment segment;
	MemorySegment sqEntriesSegment;
	MemorySegment cqEntriesSegment;

	public io_uring_params(Arena session) {
		this.segment = session.allocate(io_uring_params.layout);
		this.sqEntriesSegment = session.allocate(ValueLayout.JAVA_INT);
		this.cqEntriesSegment = session.allocate(ValueLayout.JAVA_INT);
	}

	public static final GroupLayout layout = MemoryLayout.structLayout(
			ValueLayout.JAVA_INT.withName("sq_entries"),
			ValueLayout.JAVA_INT.withName("cq_entries"),
			ValueLayout.JAVA_INT.withName("flags"),
			ValueLayout.JAVA_INT.withName("sq_thread_cpu"),
			ValueLayout.JAVA_INT.withName("sq_thread_idle"),
			ValueLayout.JAVA_INT.withName("features"),
			ValueLayout.JAVA_INT.withName("wq_fd"),
			MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("resv"),
			io_sqring_offsets.layout.withName("sq_off"),
			io_cqring_offsets.layout.withName("cq_off")).withName("io_uring_params");

	private static VarHandle sqEntriesVarHandle = layout.varHandle(PathElement.groupElement("sq_entries"));
	private static VarHandle cqEntriesVarHandle = layout.varHandle(PathElement.groupElement("cq_entries"));
	private static VarHandle flagsVarHandle = layout.varHandle(PathElement.groupElement("flags"));
	private static VarHandle featuresVarHandle = layout.varHandle(PathElement.groupElement("features"));

	public static int getSqEntries(MemorySegment data) {
		return (int) sqEntriesVarHandle.get(data);
	}

	public static int getCqEntries(MemorySegment data) {
		return (int) cqEntriesVarHandle.get(data);
	}

	public static int getFlags(MemorySegment data) {
		return (int) flagsVarHandle.get(data);
	}

	public static int getFeatures(MemorySegment data) {
		return (int) featuresVarHandle.get(data);
	}

	public static void setSqEntries(MemorySegment data, int value) {
		sqEntriesVarHandle.set(data, value);
	}

	public static void setCqEntries(MemorySegment data, int value) {
		cqEntriesVarHandle.set(data, value);
	}

	public static void setFlags(MemorySegment data, int value) {
		flagsVarHandle.set(data, value);
	}

	public static void setFeatures(MemorySegment data, int value) {
		featuresVarHandle.set(data, value);
	}

}
