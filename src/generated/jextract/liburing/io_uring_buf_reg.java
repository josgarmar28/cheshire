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
 * struct io_uring_buf_reg {
 *     __u64 ring_addr;
 *     __u32 ring_entries;
 *     __u16 bgid;
 *     __u16 flags;
 *     __u64 resv[3];
 * }
 * }
 */
public class io_uring_buf_reg {

    io_uring_buf_reg() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        liburing_h.C_LONG_LONG.withName("ring_addr"),
        liburing_h.C_INT.withName("ring_entries"),
        liburing_h.C_SHORT.withName("bgid"),
        liburing_h.C_SHORT.withName("flags"),
        MemoryLayout.sequenceLayout(3, liburing_h.C_LONG_LONG).withName("resv")
    ).withName("io_uring_buf_reg");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong ring_addr$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ring_addr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u64 ring_addr
     * }
     */
    public static final OfLong ring_addr$layout() {
        return ring_addr$LAYOUT;
    }

    private static final long ring_addr$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u64 ring_addr
     * }
     */
    public static final long ring_addr$offset() {
        return ring_addr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u64 ring_addr
     * }
     */
    public static long ring_addr(MemorySegment struct) {
        return struct.get(ring_addr$LAYOUT, ring_addr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u64 ring_addr
     * }
     */
    public static void ring_addr(MemorySegment struct, long fieldValue) {
        struct.set(ring_addr$LAYOUT, ring_addr$OFFSET, fieldValue);
    }

    private static final OfInt ring_entries$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ring_entries"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u32 ring_entries
     * }
     */
    public static final OfInt ring_entries$layout() {
        return ring_entries$LAYOUT;
    }

    private static final long ring_entries$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u32 ring_entries
     * }
     */
    public static final long ring_entries$offset() {
        return ring_entries$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u32 ring_entries
     * }
     */
    public static int ring_entries(MemorySegment struct) {
        return struct.get(ring_entries$LAYOUT, ring_entries$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u32 ring_entries
     * }
     */
    public static void ring_entries(MemorySegment struct, int fieldValue) {
        struct.set(ring_entries$LAYOUT, ring_entries$OFFSET, fieldValue);
    }

    private static final OfShort bgid$LAYOUT = (OfShort)$LAYOUT.select(groupElement("bgid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u16 bgid
     * }
     */
    public static final OfShort bgid$layout() {
        return bgid$LAYOUT;
    }

    private static final long bgid$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u16 bgid
     * }
     */
    public static final long bgid$offset() {
        return bgid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u16 bgid
     * }
     */
    public static short bgid(MemorySegment struct) {
        return struct.get(bgid$LAYOUT, bgid$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u16 bgid
     * }
     */
    public static void bgid(MemorySegment struct, short fieldValue) {
        struct.set(bgid$LAYOUT, bgid$OFFSET, fieldValue);
    }

    private static final OfShort flags$LAYOUT = (OfShort)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u16 flags
     * }
     */
    public static final OfShort flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 14;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u16 flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u16 flags
     * }
     */
    public static short flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u16 flags
     * }
     */
    public static void flags(MemorySegment struct, short fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    private static final SequenceLayout resv$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("resv"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u64 resv[3]
     * }
     */
    public static final SequenceLayout resv$layout() {
        return resv$LAYOUT;
    }

    private static final long resv$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u64 resv[3]
     * }
     */
    public static final long resv$offset() {
        return resv$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u64 resv[3]
     * }
     */
    public static MemorySegment resv(MemorySegment struct) {
        return struct.asSlice(resv$OFFSET, resv$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u64 resv[3]
     * }
     */
    public static void resv(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, resv$OFFSET, resv$LAYOUT.byteSize());
    }

    private static long[] resv$DIMS = { 3 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * __u64 resv[3]
     * }
     */
    public static long[] resv$dimensions() {
        return resv$DIMS;
    }
    private static final VarHandle resv$ELEM_HANDLE = resv$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * __u64 resv[3]
     * }
     */
    public static long resv(MemorySegment struct, long index0) {
        return (long)resv$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * __u64 resv[3]
     * }
     */
    public static void resv(MemorySegment struct, long index0, long fieldValue) {
        resv$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

