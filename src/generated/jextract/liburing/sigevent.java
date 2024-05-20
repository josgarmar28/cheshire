// Generated by jextract

package jextract.liburing;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct sigevent {
 *     __sigval_t sigev_value;
 *     int sigev_signo;
 *     int sigev_notify;
 *     union {
 *         int _pad[12];
 *         __pid_t _tid;
 *         struct {
 *             void (*_function)(__sigval_t);
 *             pthread_attr_t *_attribute;
 *         } _sigev_thread;
 *     } _sigev_un;
 * }
 * }
 */
public class sigevent {

    sigevent() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        sigval.layout().withName("sigev_value"),
        liburing_h.C_INT.withName("sigev_signo"),
        liburing_h.C_INT.withName("sigev_notify"),
        sigevent._sigev_un.layout().withName("_sigev_un")
    ).withName("sigevent");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout sigev_value$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("sigev_value"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __sigval_t sigev_value
     * }
     */
    public static final GroupLayout sigev_value$layout() {
        return sigev_value$LAYOUT;
    }

    private static final long sigev_value$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __sigval_t sigev_value
     * }
     */
    public static final long sigev_value$offset() {
        return sigev_value$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __sigval_t sigev_value
     * }
     */
    public static MemorySegment sigev_value(MemorySegment struct) {
        return struct.asSlice(sigev_value$OFFSET, sigev_value$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __sigval_t sigev_value
     * }
     */
    public static void sigev_value(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, sigev_value$OFFSET, sigev_value$LAYOUT.byteSize());
    }

    private static final OfInt sigev_signo$LAYOUT = (OfInt)$LAYOUT.select(groupElement("sigev_signo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int sigev_signo
     * }
     */
    public static final OfInt sigev_signo$layout() {
        return sigev_signo$LAYOUT;
    }

    private static final long sigev_signo$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int sigev_signo
     * }
     */
    public static final long sigev_signo$offset() {
        return sigev_signo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int sigev_signo
     * }
     */
    public static int sigev_signo(MemorySegment struct) {
        return struct.get(sigev_signo$LAYOUT, sigev_signo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int sigev_signo
     * }
     */
    public static void sigev_signo(MemorySegment struct, int fieldValue) {
        struct.set(sigev_signo$LAYOUT, sigev_signo$OFFSET, fieldValue);
    }

    private static final OfInt sigev_notify$LAYOUT = (OfInt)$LAYOUT.select(groupElement("sigev_notify"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int sigev_notify
     * }
     */
    public static final OfInt sigev_notify$layout() {
        return sigev_notify$LAYOUT;
    }

    private static final long sigev_notify$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int sigev_notify
     * }
     */
    public static final long sigev_notify$offset() {
        return sigev_notify$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int sigev_notify
     * }
     */
    public static int sigev_notify(MemorySegment struct) {
        return struct.get(sigev_notify$LAYOUT, sigev_notify$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int sigev_notify
     * }
     */
    public static void sigev_notify(MemorySegment struct, int fieldValue) {
        struct.set(sigev_notify$LAYOUT, sigev_notify$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * union {
     *     int _pad[12];
     *     __pid_t _tid;
     *     struct {
     *         void (*_function)(__sigval_t);
     *         pthread_attr_t *_attribute;
     *     } _sigev_thread;
     * }
     * }
     */
    public static class _sigev_un {

        _sigev_un() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            MemoryLayout.sequenceLayout(12, liburing_h.C_INT).withName("_pad"),
            liburing_h.C_INT.withName("_tid"),
            sigevent._sigev_un._sigev_thread.layout().withName("_sigev_thread")
        ).withName("$anon$28:5");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final SequenceLayout _pad$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("_pad"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * int _pad[12]
         * }
         */
        public static final SequenceLayout _pad$layout() {
            return _pad$LAYOUT;
        }

        private static final long _pad$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * int _pad[12]
         * }
         */
        public static final long _pad$offset() {
            return _pad$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * int _pad[12]
         * }
         */
        public static MemorySegment _pad(MemorySegment union) {
            return union.asSlice(_pad$OFFSET, _pad$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * int _pad[12]
         * }
         */
        public static void _pad(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, _pad$OFFSET, _pad$LAYOUT.byteSize());
        }

        private static long[] _pad$DIMS = { 12 };

        /**
         * Dimensions for array field:
         * {@snippet lang=c :
         * int _pad[12]
         * }
         */
        public static long[] _pad$dimensions() {
            return _pad$DIMS;
        }
        private static final VarHandle _pad$ELEM_HANDLE = _pad$LAYOUT.varHandle(sequenceElement());

        /**
         * Indexed getter for field:
         * {@snippet lang=c :
         * int _pad[12]
         * }
         */
        public static int _pad(MemorySegment union, long index0) {
            return (int)_pad$ELEM_HANDLE.get(union, 0L, index0);
        }

        /**
         * Indexed setter for field:
         * {@snippet lang=c :
         * int _pad[12]
         * }
         */
        public static void _pad(MemorySegment union, long index0, int fieldValue) {
            _pad$ELEM_HANDLE.set(union, 0L, index0, fieldValue);
        }

        private static final OfInt _tid$LAYOUT = (OfInt)$LAYOUT.select(groupElement("_tid"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * __pid_t _tid
         * }
         */
        public static final OfInt _tid$layout() {
            return _tid$LAYOUT;
        }

        private static final long _tid$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * __pid_t _tid
         * }
         */
        public static final long _tid$offset() {
            return _tid$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * __pid_t _tid
         * }
         */
        public static int _tid(MemorySegment union) {
            return union.get(_tid$LAYOUT, _tid$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * __pid_t _tid
         * }
         */
        public static void _tid(MemorySegment union, int fieldValue) {
            union.set(_tid$LAYOUT, _tid$OFFSET, fieldValue);
        }

        /**
         * {@snippet lang=c :
         * struct {
         *     void (*_function)(__sigval_t);
         *     pthread_attr_t *_attribute;
         * }
         * }
         */
        public static class _sigev_thread {

            _sigev_thread() {
                // Should not be called directly
            }

            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
                liburing_h.C_POINTER.withName("_function"),
                liburing_h.C_POINTER.withName("_attribute")
            ).withName("$anon$36:2");

            /**
             * The layout of this struct
             */
            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            /**
             * {@snippet lang=c :
             * void (*_function)(__sigval_t)
             * }
             */
            public static class _function {

                _function() {
                    // Should not be called directly
                }

                /**
                 * The function pointer signature, expressed as a functional interface
                 */
                public interface Function {
                    void apply(MemorySegment _x0);
                }

                private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
                    sigval.layout()
                );

                /**
                 * The descriptor of this function pointer
                 */
                public static FunctionDescriptor descriptor() {
                    return $DESC;
                }

                private static final MethodHandle UP$MH = liburing_h.upcallHandle(_function.Function.class, "apply", $DESC);

                /**
                 * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
                 * The lifetime of the returned segment is managed by {@code arena}
                 */
                public static MemorySegment allocate(_function.Function fi, Arena arena) {
                    return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
                }

                private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

                /**
                 * Invoke the upcall stub {@code funcPtr}, with given parameters
                 */
                public static void invoke(MemorySegment funcPtr,MemorySegment _x0) {
                    try {
                         DOWN$MH.invokeExact(funcPtr, _x0);
                    } catch (Throwable ex$) {
                        throw new AssertionError("should not reach here", ex$);
                    }
                }
            }

            private static final AddressLayout _function$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_function"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * void (*_function)(__sigval_t)
             * }
             */
            public static final AddressLayout _function$layout() {
                return _function$LAYOUT;
            }

            private static final long _function$OFFSET = 0;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * void (*_function)(__sigval_t)
             * }
             */
            public static final long _function$offset() {
                return _function$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * void (*_function)(__sigval_t)
             * }
             */
            public static MemorySegment _function(MemorySegment struct) {
                return struct.get(_function$LAYOUT, _function$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * void (*_function)(__sigval_t)
             * }
             */
            public static void _function(MemorySegment struct, MemorySegment fieldValue) {
                struct.set(_function$LAYOUT, _function$OFFSET, fieldValue);
            }

            private static final AddressLayout _attribute$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_attribute"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * pthread_attr_t *_attribute
             * }
             */
            public static final AddressLayout _attribute$layout() {
                return _attribute$LAYOUT;
            }

            private static final long _attribute$OFFSET = 8;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * pthread_attr_t *_attribute
             * }
             */
            public static final long _attribute$offset() {
                return _attribute$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * pthread_attr_t *_attribute
             * }
             */
            public static MemorySegment _attribute(MemorySegment struct) {
                return struct.get(_attribute$LAYOUT, _attribute$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * pthread_attr_t *_attribute
             * }
             */
            public static void _attribute(MemorySegment struct, MemorySegment fieldValue) {
                struct.set(_attribute$LAYOUT, _attribute$OFFSET, fieldValue);
            }

            /**
             * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
             * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
             */
            public static MemorySegment asSlice(MemorySegment array, long index) {
                return array.asSlice(layout().byteSize() * index);
            }

            /**
             * The size (in bytes) of this struct
             */
            public static long sizeof() { return layout().byteSize(); }

            /**
             * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
             */
            public static MemorySegment allocate(SegmentAllocator allocator) {
                return allocator.allocate(layout());
            }

            /**
             * Allocate an array of size {@code elementCount} using {@code allocator}.
             * The returned segment has size {@code elementCount * layout().byteSize()}.
             */
            public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
            }

            /**
             * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
             * The returned segment has size {@code layout().byteSize()}
             */
            public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
                return reinterpret(addr, 1, arena, cleanup);
            }

            /**
             * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
             * The returned segment has size {@code elementCount * layout().byteSize()}
             */
            public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
                return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
            }
        }

        private static final GroupLayout _sigev_thread$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("_sigev_thread"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct {
         *     void (*_function)(__sigval_t);
         *     pthread_attr_t *_attribute;
         * } _sigev_thread
         * }
         */
        public static final GroupLayout _sigev_thread$layout() {
            return _sigev_thread$LAYOUT;
        }

        private static final long _sigev_thread$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct {
         *     void (*_function)(__sigval_t);
         *     pthread_attr_t *_attribute;
         * } _sigev_thread
         * }
         */
        public static final long _sigev_thread$offset() {
            return _sigev_thread$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct {
         *     void (*_function)(__sigval_t);
         *     pthread_attr_t *_attribute;
         * } _sigev_thread
         * }
         */
        public static MemorySegment _sigev_thread(MemorySegment union) {
            return union.asSlice(_sigev_thread$OFFSET, _sigev_thread$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct {
         *     void (*_function)(__sigval_t);
         *     pthread_attr_t *_attribute;
         * } _sigev_thread
         * }
         */
        public static void _sigev_thread(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, _sigev_thread$OFFSET, _sigev_thread$LAYOUT.byteSize());
        }

        /**
         * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
         * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
         */
        public static MemorySegment asSlice(MemorySegment array, long index) {
            return array.asSlice(layout().byteSize() * index);
        }

        /**
         * The size (in bytes) of this union
         */
        public static long sizeof() { return layout().byteSize(); }

        /**
         * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
         */
        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate(layout());
        }

        /**
         * Allocate an array of size {@code elementCount} using {@code allocator}.
         * The returned segment has size {@code elementCount * layout().byteSize()}.
         */
        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
        }

        /**
         * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
         * The returned segment has size {@code layout().byteSize()}
         */
        public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
            return reinterpret(addr, 1, arena, cleanup);
        }

        /**
         * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
         * The returned segment has size {@code elementCount * layout().byteSize()}
         */
        public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    private static final GroupLayout _sigev_un$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("_sigev_un"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * union {
     *     int _pad[12];
     *     __pid_t _tid;
     *     struct {
     *         void (*_function)(__sigval_t);
     *         pthread_attr_t *_attribute;
     *     } _sigev_thread;
     * } _sigev_un
     * }
     */
    public static final GroupLayout _sigev_un$layout() {
        return _sigev_un$LAYOUT;
    }

    private static final long _sigev_un$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union {
     *     int _pad[12];
     *     __pid_t _tid;
     *     struct {
     *         void (*_function)(__sigval_t);
     *         pthread_attr_t *_attribute;
     *     } _sigev_thread;
     * } _sigev_un
     * }
     */
    public static final long _sigev_un$offset() {
        return _sigev_un$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union {
     *     int _pad[12];
     *     __pid_t _tid;
     *     struct {
     *         void (*_function)(__sigval_t);
     *         pthread_attr_t *_attribute;
     *     } _sigev_thread;
     * } _sigev_un
     * }
     */
    public static MemorySegment _sigev_un(MemorySegment struct) {
        return struct.asSlice(_sigev_un$OFFSET, _sigev_un$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union {
     *     int _pad[12];
     *     __pid_t _tid;
     *     struct {
     *         void (*_function)(__sigval_t);
     *         pthread_attr_t *_attribute;
     *     } _sigev_thread;
     * } _sigev_un
     * }
     */
    public static void _sigev_un(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, _sigev_un$OFFSET, _sigev_un$LAYOUT.byteSize());
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

