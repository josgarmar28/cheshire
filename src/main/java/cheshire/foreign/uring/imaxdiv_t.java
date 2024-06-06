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
 * struct {
 *     long quot;
 *     long rem;
 * }
 * }
 */
public class imaxdiv_t {

    imaxdiv_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        liburing_h.C_LONG.withName("quot"),
        liburing_h.C_LONG.withName("rem")
    ).withName("$anon$332:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong quot$LAYOUT = (OfLong)$LAYOUT.select(groupElement("quot"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long quot
     * }
     */
    public static final OfLong quot$layout() {
        return quot$LAYOUT;
    }

    private static final long quot$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long quot
     * }
     */
    public static final long quot$offset() {
        return quot$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long quot
     * }
     */
    public static long quot(MemorySegment struct) {
        return struct.get(quot$LAYOUT, quot$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long quot
     * }
     */
    public static void quot(MemorySegment struct, long fieldValue) {
        struct.set(quot$LAYOUT, quot$OFFSET, fieldValue);
    }

    private static final OfLong rem$LAYOUT = (OfLong)$LAYOUT.select(groupElement("rem"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long rem
     * }
     */
    public static final OfLong rem$layout() {
        return rem$LAYOUT;
    }

    private static final long rem$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long rem
     * }
     */
    public static final long rem$offset() {
        return rem$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long rem
     * }
     */
    public static long rem(MemorySegment struct) {
        return struct.get(rem$LAYOUT, rem$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long rem
     * }
     */
    public static void rem(MemorySegment struct, long fieldValue) {
        struct.set(rem$LAYOUT, rem$OFFSET, fieldValue);
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

