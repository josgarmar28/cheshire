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
 * struct __pthread_rwlock_arch_t {
 *     unsigned int __readers;
 *     unsigned int __writers;
 *     unsigned int __wrphase_futex;
 *     unsigned int __writers_futex;
 *     unsigned int __pad3;
 *     unsigned int __pad4;
 *     int __cur_writer;
 *     int __shared;
 *     signed char __rwelision;
 *     unsigned char __pad1[7];
 *     unsigned long __pad2;
 *     unsigned int __flags;
 * }
 * }
 */
public class __pthread_rwlock_arch_t {

    __pthread_rwlock_arch_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        liburing_h.C_INT.withName("__readers"),
        liburing_h.C_INT.withName("__writers"),
        liburing_h.C_INT.withName("__wrphase_futex"),
        liburing_h.C_INT.withName("__writers_futex"),
        liburing_h.C_INT.withName("__pad3"),
        liburing_h.C_INT.withName("__pad4"),
        liburing_h.C_INT.withName("__cur_writer"),
        liburing_h.C_INT.withName("__shared"),
        liburing_h.C_CHAR.withName("__rwelision"),
        MemoryLayout.sequenceLayout(7, liburing_h.C_CHAR).withName("__pad1"),
        liburing_h.C_LONG.withName("__pad2"),
        liburing_h.C_INT.withName("__flags"),
        MemoryLayout.paddingLayout(4)
    ).withName("__pthread_rwlock_arch_t");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt __readers$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__readers"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int __readers
     * }
     */
    public static final OfInt __readers$layout() {
        return __readers$LAYOUT;
    }

    private static final long __readers$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int __readers
     * }
     */
    public static final long __readers$offset() {
        return __readers$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int __readers
     * }
     */
    public static int __readers(MemorySegment struct) {
        return struct.get(__readers$LAYOUT, __readers$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int __readers
     * }
     */
    public static void __readers(MemorySegment struct, int fieldValue) {
        struct.set(__readers$LAYOUT, __readers$OFFSET, fieldValue);
    }

    private static final OfInt __writers$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__writers"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int __writers
     * }
     */
    public static final OfInt __writers$layout() {
        return __writers$LAYOUT;
    }

    private static final long __writers$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int __writers
     * }
     */
    public static final long __writers$offset() {
        return __writers$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int __writers
     * }
     */
    public static int __writers(MemorySegment struct) {
        return struct.get(__writers$LAYOUT, __writers$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int __writers
     * }
     */
    public static void __writers(MemorySegment struct, int fieldValue) {
        struct.set(__writers$LAYOUT, __writers$OFFSET, fieldValue);
    }

    private static final OfInt __wrphase_futex$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__wrphase_futex"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int __wrphase_futex
     * }
     */
    public static final OfInt __wrphase_futex$layout() {
        return __wrphase_futex$LAYOUT;
    }

    private static final long __wrphase_futex$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int __wrphase_futex
     * }
     */
    public static final long __wrphase_futex$offset() {
        return __wrphase_futex$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int __wrphase_futex
     * }
     */
    public static int __wrphase_futex(MemorySegment struct) {
        return struct.get(__wrphase_futex$LAYOUT, __wrphase_futex$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int __wrphase_futex
     * }
     */
    public static void __wrphase_futex(MemorySegment struct, int fieldValue) {
        struct.set(__wrphase_futex$LAYOUT, __wrphase_futex$OFFSET, fieldValue);
    }

    private static final OfInt __writers_futex$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__writers_futex"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int __writers_futex
     * }
     */
    public static final OfInt __writers_futex$layout() {
        return __writers_futex$LAYOUT;
    }

    private static final long __writers_futex$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int __writers_futex
     * }
     */
    public static final long __writers_futex$offset() {
        return __writers_futex$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int __writers_futex
     * }
     */
    public static int __writers_futex(MemorySegment struct) {
        return struct.get(__writers_futex$LAYOUT, __writers_futex$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int __writers_futex
     * }
     */
    public static void __writers_futex(MemorySegment struct, int fieldValue) {
        struct.set(__writers_futex$LAYOUT, __writers_futex$OFFSET, fieldValue);
    }

    private static final OfInt __pad3$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__pad3"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int __pad3
     * }
     */
    public static final OfInt __pad3$layout() {
        return __pad3$LAYOUT;
    }

    private static final long __pad3$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int __pad3
     * }
     */
    public static final long __pad3$offset() {
        return __pad3$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int __pad3
     * }
     */
    public static int __pad3(MemorySegment struct) {
        return struct.get(__pad3$LAYOUT, __pad3$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int __pad3
     * }
     */
    public static void __pad3(MemorySegment struct, int fieldValue) {
        struct.set(__pad3$LAYOUT, __pad3$OFFSET, fieldValue);
    }

    private static final OfInt __pad4$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__pad4"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int __pad4
     * }
     */
    public static final OfInt __pad4$layout() {
        return __pad4$LAYOUT;
    }

    private static final long __pad4$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int __pad4
     * }
     */
    public static final long __pad4$offset() {
        return __pad4$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int __pad4
     * }
     */
    public static int __pad4(MemorySegment struct) {
        return struct.get(__pad4$LAYOUT, __pad4$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int __pad4
     * }
     */
    public static void __pad4(MemorySegment struct, int fieldValue) {
        struct.set(__pad4$LAYOUT, __pad4$OFFSET, fieldValue);
    }

    private static final OfInt __cur_writer$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__cur_writer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int __cur_writer
     * }
     */
    public static final OfInt __cur_writer$layout() {
        return __cur_writer$LAYOUT;
    }

    private static final long __cur_writer$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int __cur_writer
     * }
     */
    public static final long __cur_writer$offset() {
        return __cur_writer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int __cur_writer
     * }
     */
    public static int __cur_writer(MemorySegment struct) {
        return struct.get(__cur_writer$LAYOUT, __cur_writer$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int __cur_writer
     * }
     */
    public static void __cur_writer(MemorySegment struct, int fieldValue) {
        struct.set(__cur_writer$LAYOUT, __cur_writer$OFFSET, fieldValue);
    }

    private static final OfInt __shared$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__shared"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int __shared
     * }
     */
    public static final OfInt __shared$layout() {
        return __shared$LAYOUT;
    }

    private static final long __shared$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int __shared
     * }
     */
    public static final long __shared$offset() {
        return __shared$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int __shared
     * }
     */
    public static int __shared(MemorySegment struct) {
        return struct.get(__shared$LAYOUT, __shared$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int __shared
     * }
     */
    public static void __shared(MemorySegment struct, int fieldValue) {
        struct.set(__shared$LAYOUT, __shared$OFFSET, fieldValue);
    }

    private static final OfByte __rwelision$LAYOUT = (OfByte)$LAYOUT.select(groupElement("__rwelision"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * signed char __rwelision
     * }
     */
    public static final OfByte __rwelision$layout() {
        return __rwelision$LAYOUT;
    }

    private static final long __rwelision$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * signed char __rwelision
     * }
     */
    public static final long __rwelision$offset() {
        return __rwelision$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * signed char __rwelision
     * }
     */
    public static byte __rwelision(MemorySegment struct) {
        return struct.get(__rwelision$LAYOUT, __rwelision$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * signed char __rwelision
     * }
     */
    public static void __rwelision(MemorySegment struct, byte fieldValue) {
        struct.set(__rwelision$LAYOUT, __rwelision$OFFSET, fieldValue);
    }

    private static final SequenceLayout __pad1$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("__pad1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned char __pad1[7]
     * }
     */
    public static final SequenceLayout __pad1$layout() {
        return __pad1$LAYOUT;
    }

    private static final long __pad1$OFFSET = 33;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned char __pad1[7]
     * }
     */
    public static final long __pad1$offset() {
        return __pad1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned char __pad1[7]
     * }
     */
    public static MemorySegment __pad1(MemorySegment struct) {
        return struct.asSlice(__pad1$OFFSET, __pad1$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned char __pad1[7]
     * }
     */
    public static void __pad1(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, __pad1$OFFSET, __pad1$LAYOUT.byteSize());
    }

    private static long[] __pad1$DIMS = { 7 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * unsigned char __pad1[7]
     * }
     */
    public static long[] __pad1$dimensions() {
        return __pad1$DIMS;
    }
    private static final VarHandle __pad1$ELEM_HANDLE = __pad1$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * unsigned char __pad1[7]
     * }
     */
    public static byte __pad1(MemorySegment struct, long index0) {
        return (byte)__pad1$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * unsigned char __pad1[7]
     * }
     */
    public static void __pad1(MemorySegment struct, long index0, byte fieldValue) {
        __pad1$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfLong __pad2$LAYOUT = (OfLong)$LAYOUT.select(groupElement("__pad2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long __pad2
     * }
     */
    public static final OfLong __pad2$layout() {
        return __pad2$LAYOUT;
    }

    private static final long __pad2$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long __pad2
     * }
     */
    public static final long __pad2$offset() {
        return __pad2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long __pad2
     * }
     */
    public static long __pad2(MemorySegment struct) {
        return struct.get(__pad2$LAYOUT, __pad2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long __pad2
     * }
     */
    public static void __pad2(MemorySegment struct, long fieldValue) {
        struct.set(__pad2$LAYOUT, __pad2$OFFSET, fieldValue);
    }

    private static final OfInt __flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int __flags
     * }
     */
    public static final OfInt __flags$layout() {
        return __flags$LAYOUT;
    }

    private static final long __flags$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int __flags
     * }
     */
    public static final long __flags$offset() {
        return __flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int __flags
     * }
     */
    public static int __flags(MemorySegment struct) {
        return struct.get(__flags$LAYOUT, __flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int __flags
     * }
     */
    public static void __flags(MemorySegment struct, int fieldValue) {
        struct.set(__flags$LAYOUT, __flags$OFFSET, fieldValue);
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

