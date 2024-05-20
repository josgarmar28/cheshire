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
 * struct io_uring_sync_cancel_reg {
 *     __u64 addr;
 *     __s32 fd;
 *     __u32 flags;
 *     struct __kernel_timespec timeout;
 *     __u64 pad[4];
 * }
 * }
 */
public class io_uring_sync_cancel_reg {

    io_uring_sync_cancel_reg() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        liburing_h.C_LONG_LONG.withName("addr"),
        liburing_h.C_INT.withName("fd"),
        liburing_h.C_INT.withName("flags"),
        __kernel_timespec.layout().withName("timeout"),
        MemoryLayout.sequenceLayout(4, liburing_h.C_LONG_LONG).withName("pad")
    ).withName("io_uring_sync_cancel_reg");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong addr$LAYOUT = (OfLong)$LAYOUT.select(groupElement("addr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u64 addr
     * }
     */
    public static final OfLong addr$layout() {
        return addr$LAYOUT;
    }

    private static final long addr$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u64 addr
     * }
     */
    public static final long addr$offset() {
        return addr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u64 addr
     * }
     */
    public static long addr(MemorySegment struct) {
        return struct.get(addr$LAYOUT, addr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u64 addr
     * }
     */
    public static void addr(MemorySegment struct, long fieldValue) {
        struct.set(addr$LAYOUT, addr$OFFSET, fieldValue);
    }

    private static final OfInt fd$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fd"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __s32 fd
     * }
     */
    public static final OfInt fd$layout() {
        return fd$LAYOUT;
    }

    private static final long fd$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __s32 fd
     * }
     */
    public static final long fd$offset() {
        return fd$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __s32 fd
     * }
     */
    public static int fd(MemorySegment struct) {
        return struct.get(fd$LAYOUT, fd$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __s32 fd
     * }
     */
    public static void fd(MemorySegment struct, int fieldValue) {
        struct.set(fd$LAYOUT, fd$OFFSET, fieldValue);
    }

    private static final OfInt flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u32 flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u32 flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u32 flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u32 flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    private static final GroupLayout timeout$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("timeout"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct __kernel_timespec timeout
     * }
     */
    public static final GroupLayout timeout$layout() {
        return timeout$LAYOUT;
    }

    private static final long timeout$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct __kernel_timespec timeout
     * }
     */
    public static final long timeout$offset() {
        return timeout$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct __kernel_timespec timeout
     * }
     */
    public static MemorySegment timeout(MemorySegment struct) {
        return struct.asSlice(timeout$OFFSET, timeout$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct __kernel_timespec timeout
     * }
     */
    public static void timeout(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, timeout$OFFSET, timeout$LAYOUT.byteSize());
    }

    private static final SequenceLayout pad$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("pad"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u64 pad[4]
     * }
     */
    public static final SequenceLayout pad$layout() {
        return pad$LAYOUT;
    }

    private static final long pad$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u64 pad[4]
     * }
     */
    public static final long pad$offset() {
        return pad$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u64 pad[4]
     * }
     */
    public static MemorySegment pad(MemorySegment struct) {
        return struct.asSlice(pad$OFFSET, pad$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u64 pad[4]
     * }
     */
    public static void pad(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, pad$OFFSET, pad$LAYOUT.byteSize());
    }

    private static long[] pad$DIMS = { 4 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * __u64 pad[4]
     * }
     */
    public static long[] pad$dimensions() {
        return pad$DIMS;
    }
    private static final VarHandle pad$ELEM_HANDLE = pad$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * __u64 pad[4]
     * }
     */
    public static long pad(MemorySegment struct, long index0) {
        return (long)pad$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * __u64 pad[4]
     * }
     */
    public static void pad(MemorySegment struct, long index0, long fieldValue) {
        pad$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

