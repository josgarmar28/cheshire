// Generated by jextract

package foreign.uring;

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
 * struct io_uring_getevents_arg {
 *     __u64 sigmask;
 *     __u32 sigmask_sz;
 *     __u32 pad;
 *     __u64 ts;
 * }
 * }
 */
public class io_uring_getevents_arg {

    io_uring_getevents_arg() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        liburing_h.C_LONG_LONG.withName("sigmask"),
        liburing_h.C_INT.withName("sigmask_sz"),
        liburing_h.C_INT.withName("pad"),
        liburing_h.C_LONG_LONG.withName("ts")
    ).withName("io_uring_getevents_arg");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong sigmask$LAYOUT = (OfLong)$LAYOUT.select(groupElement("sigmask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u64 sigmask
     * }
     */
    public static final OfLong sigmask$layout() {
        return sigmask$LAYOUT;
    }

    private static final long sigmask$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u64 sigmask
     * }
     */
    public static final long sigmask$offset() {
        return sigmask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u64 sigmask
     * }
     */
    public static long sigmask(MemorySegment struct) {
        return struct.get(sigmask$LAYOUT, sigmask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u64 sigmask
     * }
     */
    public static void sigmask(MemorySegment struct, long fieldValue) {
        struct.set(sigmask$LAYOUT, sigmask$OFFSET, fieldValue);
    }

    private static final OfInt sigmask_sz$LAYOUT = (OfInt)$LAYOUT.select(groupElement("sigmask_sz"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u32 sigmask_sz
     * }
     */
    public static final OfInt sigmask_sz$layout() {
        return sigmask_sz$LAYOUT;
    }

    private static final long sigmask_sz$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u32 sigmask_sz
     * }
     */
    public static final long sigmask_sz$offset() {
        return sigmask_sz$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u32 sigmask_sz
     * }
     */
    public static int sigmask_sz(MemorySegment struct) {
        return struct.get(sigmask_sz$LAYOUT, sigmask_sz$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u32 sigmask_sz
     * }
     */
    public static void sigmask_sz(MemorySegment struct, int fieldValue) {
        struct.set(sigmask_sz$LAYOUT, sigmask_sz$OFFSET, fieldValue);
    }

    private static final OfInt pad$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pad"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u32 pad
     * }
     */
    public static final OfInt pad$layout() {
        return pad$LAYOUT;
    }

    private static final long pad$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u32 pad
     * }
     */
    public static final long pad$offset() {
        return pad$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u32 pad
     * }
     */
    public static int pad(MemorySegment struct) {
        return struct.get(pad$LAYOUT, pad$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u32 pad
     * }
     */
    public static void pad(MemorySegment struct, int fieldValue) {
        struct.set(pad$LAYOUT, pad$OFFSET, fieldValue);
    }

    private static final OfLong ts$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ts"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u64 ts
     * }
     */
    public static final OfLong ts$layout() {
        return ts$LAYOUT;
    }

    private static final long ts$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u64 ts
     * }
     */
    public static final long ts$offset() {
        return ts$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u64 ts
     * }
     */
    public static long ts(MemorySegment struct) {
        return struct.get(ts$LAYOUT, ts$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u64 ts
     * }
     */
    public static void ts(MemorySegment struct, long fieldValue) {
        struct.set(ts$LAYOUT, ts$OFFSET, fieldValue);
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

