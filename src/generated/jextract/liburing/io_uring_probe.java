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
 * struct io_uring_probe {
 *     __u8 last_op;
 *     __u8 ops_len;
 *     __u16 resv;
 *     __u32 resv2[3];
 *     struct io_uring_probe_op ops[];
 * }
 * }
 */
public class io_uring_probe {

    io_uring_probe() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        liburing_h.C_CHAR.withName("last_op"),
        liburing_h.C_CHAR.withName("ops_len"),
        liburing_h.C_SHORT.withName("resv"),
        MemoryLayout.sequenceLayout(3, liburing_h.C_INT).withName("resv2"),
        MemoryLayout.sequenceLayout(0, io_uring_probe_op.layout()).withName("ops")
    ).withName("io_uring_probe");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfByte last_op$LAYOUT = (OfByte)$LAYOUT.select(groupElement("last_op"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u8 last_op
     * }
     */
    public static final OfByte last_op$layout() {
        return last_op$LAYOUT;
    }

    private static final long last_op$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u8 last_op
     * }
     */
    public static final long last_op$offset() {
        return last_op$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u8 last_op
     * }
     */
    public static byte last_op(MemorySegment struct) {
        return struct.get(last_op$LAYOUT, last_op$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u8 last_op
     * }
     */
    public static void last_op(MemorySegment struct, byte fieldValue) {
        struct.set(last_op$LAYOUT, last_op$OFFSET, fieldValue);
    }

    private static final OfByte ops_len$LAYOUT = (OfByte)$LAYOUT.select(groupElement("ops_len"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u8 ops_len
     * }
     */
    public static final OfByte ops_len$layout() {
        return ops_len$LAYOUT;
    }

    private static final long ops_len$OFFSET = 1;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u8 ops_len
     * }
     */
    public static final long ops_len$offset() {
        return ops_len$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u8 ops_len
     * }
     */
    public static byte ops_len(MemorySegment struct) {
        return struct.get(ops_len$LAYOUT, ops_len$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u8 ops_len
     * }
     */
    public static void ops_len(MemorySegment struct, byte fieldValue) {
        struct.set(ops_len$LAYOUT, ops_len$OFFSET, fieldValue);
    }

    private static final OfShort resv$LAYOUT = (OfShort)$LAYOUT.select(groupElement("resv"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u16 resv
     * }
     */
    public static final OfShort resv$layout() {
        return resv$LAYOUT;
    }

    private static final long resv$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u16 resv
     * }
     */
    public static final long resv$offset() {
        return resv$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u16 resv
     * }
     */
    public static short resv(MemorySegment struct) {
        return struct.get(resv$LAYOUT, resv$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u16 resv
     * }
     */
    public static void resv(MemorySegment struct, short fieldValue) {
        struct.set(resv$LAYOUT, resv$OFFSET, fieldValue);
    }

    private static final SequenceLayout resv2$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("resv2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u32 resv2[3]
     * }
     */
    public static final SequenceLayout resv2$layout() {
        return resv2$LAYOUT;
    }

    private static final long resv2$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u32 resv2[3]
     * }
     */
    public static final long resv2$offset() {
        return resv2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u32 resv2[3]
     * }
     */
    public static MemorySegment resv2(MemorySegment struct) {
        return struct.asSlice(resv2$OFFSET, resv2$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u32 resv2[3]
     * }
     */
    public static void resv2(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, resv2$OFFSET, resv2$LAYOUT.byteSize());
    }

    private static long[] resv2$DIMS = { 3 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * __u32 resv2[3]
     * }
     */
    public static long[] resv2$dimensions() {
        return resv2$DIMS;
    }
    private static final VarHandle resv2$ELEM_HANDLE = resv2$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * __u32 resv2[3]
     * }
     */
    public static int resv2(MemorySegment struct, long index0) {
        return (int)resv2$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * __u32 resv2[3]
     * }
     */
    public static void resv2(MemorySegment struct, long index0, int fieldValue) {
        resv2$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout ops$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("ops"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct io_uring_probe_op ops[]
     * }
     */
    public static final SequenceLayout ops$layout() {
        return ops$LAYOUT;
    }

    private static final long ops$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct io_uring_probe_op ops[]
     * }
     */
    public static final long ops$offset() {
        return ops$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct io_uring_probe_op ops[]
     * }
     */
    public static MemorySegment ops(MemorySegment struct) {
        return struct.asSlice(ops$OFFSET, ops$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct io_uring_probe_op ops[]
     * }
     */
    public static void ops(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ops$OFFSET, ops$LAYOUT.byteSize());
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

