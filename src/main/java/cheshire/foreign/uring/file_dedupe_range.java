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
 * struct file_dedupe_range {
 *     __u64 src_offset;
 *     __u64 src_length;
 *     __u16 dest_count;
 *     __u16 reserved1;
 *     __u32 reserved2;
 *     struct file_dedupe_range_info info[];
 * }
 * }
 */
public class file_dedupe_range {

    file_dedupe_range() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        liburing_h.C_LONG_LONG.withName("src_offset"),
        liburing_h.C_LONG_LONG.withName("src_length"),
        liburing_h.C_SHORT.withName("dest_count"),
        liburing_h.C_SHORT.withName("reserved1"),
        liburing_h.C_INT.withName("reserved2"),
        MemoryLayout.sequenceLayout(0, file_dedupe_range_info.layout()).withName("info")
    ).withName("file_dedupe_range");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong src_offset$LAYOUT = (OfLong)$LAYOUT.select(groupElement("src_offset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u64 src_offset
     * }
     */
    public static final OfLong src_offset$layout() {
        return src_offset$LAYOUT;
    }

    private static final long src_offset$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u64 src_offset
     * }
     */
    public static final long src_offset$offset() {
        return src_offset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u64 src_offset
     * }
     */
    public static long src_offset(MemorySegment struct) {
        return struct.get(src_offset$LAYOUT, src_offset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u64 src_offset
     * }
     */
    public static void src_offset(MemorySegment struct, long fieldValue) {
        struct.set(src_offset$LAYOUT, src_offset$OFFSET, fieldValue);
    }

    private static final OfLong src_length$LAYOUT = (OfLong)$LAYOUT.select(groupElement("src_length"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u64 src_length
     * }
     */
    public static final OfLong src_length$layout() {
        return src_length$LAYOUT;
    }

    private static final long src_length$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u64 src_length
     * }
     */
    public static final long src_length$offset() {
        return src_length$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u64 src_length
     * }
     */
    public static long src_length(MemorySegment struct) {
        return struct.get(src_length$LAYOUT, src_length$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u64 src_length
     * }
     */
    public static void src_length(MemorySegment struct, long fieldValue) {
        struct.set(src_length$LAYOUT, src_length$OFFSET, fieldValue);
    }

    private static final OfShort dest_count$LAYOUT = (OfShort)$LAYOUT.select(groupElement("dest_count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u16 dest_count
     * }
     */
    public static final OfShort dest_count$layout() {
        return dest_count$LAYOUT;
    }

    private static final long dest_count$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u16 dest_count
     * }
     */
    public static final long dest_count$offset() {
        return dest_count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u16 dest_count
     * }
     */
    public static short dest_count(MemorySegment struct) {
        return struct.get(dest_count$LAYOUT, dest_count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u16 dest_count
     * }
     */
    public static void dest_count(MemorySegment struct, short fieldValue) {
        struct.set(dest_count$LAYOUT, dest_count$OFFSET, fieldValue);
    }

    private static final OfShort reserved1$LAYOUT = (OfShort)$LAYOUT.select(groupElement("reserved1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u16 reserved1
     * }
     */
    public static final OfShort reserved1$layout() {
        return reserved1$LAYOUT;
    }

    private static final long reserved1$OFFSET = 18;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u16 reserved1
     * }
     */
    public static final long reserved1$offset() {
        return reserved1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u16 reserved1
     * }
     */
    public static short reserved1(MemorySegment struct) {
        return struct.get(reserved1$LAYOUT, reserved1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u16 reserved1
     * }
     */
    public static void reserved1(MemorySegment struct, short fieldValue) {
        struct.set(reserved1$LAYOUT, reserved1$OFFSET, fieldValue);
    }

    private static final OfInt reserved2$LAYOUT = (OfInt)$LAYOUT.select(groupElement("reserved2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u32 reserved2
     * }
     */
    public static final OfInt reserved2$layout() {
        return reserved2$LAYOUT;
    }

    private static final long reserved2$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u32 reserved2
     * }
     */
    public static final long reserved2$offset() {
        return reserved2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u32 reserved2
     * }
     */
    public static int reserved2(MemorySegment struct) {
        return struct.get(reserved2$LAYOUT, reserved2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u32 reserved2
     * }
     */
    public static void reserved2(MemorySegment struct, int fieldValue) {
        struct.set(reserved2$LAYOUT, reserved2$OFFSET, fieldValue);
    }

    private static final SequenceLayout info$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("info"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct file_dedupe_range_info info[]
     * }
     */
    public static final SequenceLayout info$layout() {
        return info$LAYOUT;
    }

    private static final long info$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct file_dedupe_range_info info[]
     * }
     */
    public static final long info$offset() {
        return info$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct file_dedupe_range_info info[]
     * }
     */
    public static MemorySegment info(MemorySegment struct) {
        return struct.asSlice(info$OFFSET, info$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct file_dedupe_range_info info[]
     * }
     */
    public static void info(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, info$OFFSET, info$LAYOUT.byteSize());
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

