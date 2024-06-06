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
 * struct _ymmh_state {
 *     __uint32_t ymmh_space[64];
 * }
 * }
 */
public class _ymmh_state {

    _ymmh_state() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(64, liburing_h.C_INT).withName("ymmh_space")
    ).withName("_ymmh_state");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final SequenceLayout ymmh_space$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("ymmh_space"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __uint32_t ymmh_space[64]
     * }
     */
    public static final SequenceLayout ymmh_space$layout() {
        return ymmh_space$LAYOUT;
    }

    private static final long ymmh_space$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __uint32_t ymmh_space[64]
     * }
     */
    public static final long ymmh_space$offset() {
        return ymmh_space$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __uint32_t ymmh_space[64]
     * }
     */
    public static MemorySegment ymmh_space(MemorySegment struct) {
        return struct.asSlice(ymmh_space$OFFSET, ymmh_space$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __uint32_t ymmh_space[64]
     * }
     */
    public static void ymmh_space(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ymmh_space$OFFSET, ymmh_space$LAYOUT.byteSize());
    }

    private static long[] ymmh_space$DIMS = { 64 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * __uint32_t ymmh_space[64]
     * }
     */
    public static long[] ymmh_space$dimensions() {
        return ymmh_space$DIMS;
    }
    private static final VarHandle ymmh_space$ELEM_HANDLE = ymmh_space$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * __uint32_t ymmh_space[64]
     * }
     */
    public static int ymmh_space(MemorySegment struct, long index0) {
        return (int)ymmh_space$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * __uint32_t ymmh_space[64]
     * }
     */
    public static void ymmh_space(MemorySegment struct, long index0, int fieldValue) {
        ymmh_space$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

