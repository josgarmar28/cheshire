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
 * struct osockaddr {
 *     unsigned short sa_family;
 *     unsigned char sa_data[14];
 * }
 * }
 */
public class osockaddr {

    osockaddr() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        liburing_h.C_SHORT.withName("sa_family"),
        MemoryLayout.sequenceLayout(14, liburing_h.C_CHAR).withName("sa_data")
    ).withName("osockaddr");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort sa_family$LAYOUT = (OfShort)$LAYOUT.select(groupElement("sa_family"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned short sa_family
     * }
     */
    public static final OfShort sa_family$layout() {
        return sa_family$LAYOUT;
    }

    private static final long sa_family$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned short sa_family
     * }
     */
    public static final long sa_family$offset() {
        return sa_family$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned short sa_family
     * }
     */
    public static short sa_family(MemorySegment struct) {
        return struct.get(sa_family$LAYOUT, sa_family$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned short sa_family
     * }
     */
    public static void sa_family(MemorySegment struct, short fieldValue) {
        struct.set(sa_family$LAYOUT, sa_family$OFFSET, fieldValue);
    }

    private static final SequenceLayout sa_data$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("sa_data"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned char sa_data[14]
     * }
     */
    public static final SequenceLayout sa_data$layout() {
        return sa_data$LAYOUT;
    }

    private static final long sa_data$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned char sa_data[14]
     * }
     */
    public static final long sa_data$offset() {
        return sa_data$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned char sa_data[14]
     * }
     */
    public static MemorySegment sa_data(MemorySegment struct) {
        return struct.asSlice(sa_data$OFFSET, sa_data$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned char sa_data[14]
     * }
     */
    public static void sa_data(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, sa_data$OFFSET, sa_data$LAYOUT.byteSize());
    }

    private static long[] sa_data$DIMS = { 14 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * unsigned char sa_data[14]
     * }
     */
    public static long[] sa_data$dimensions() {
        return sa_data$DIMS;
    }
    private static final VarHandle sa_data$ELEM_HANDLE = sa_data$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * unsigned char sa_data[14]
     * }
     */
    public static byte sa_data(MemorySegment struct, long index0) {
        return (byte)sa_data$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * unsigned char sa_data[14]
     * }
     */
    public static void sa_data(MemorySegment struct, long index0, byte fieldValue) {
        sa_data$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

