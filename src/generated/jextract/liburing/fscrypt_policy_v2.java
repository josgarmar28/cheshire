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
 * struct fscrypt_policy_v2 {
 *     __u8 version;
 *     __u8 contents_encryption_mode;
 *     __u8 filenames_encryption_mode;
 *     __u8 flags;
 *     __u8 __reserved[4];
 *     __u8 master_key_identifier[16];
 * }
 * }
 */
public class fscrypt_policy_v2 {

    fscrypt_policy_v2() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        liburing_h.C_CHAR.withName("version"),
        liburing_h.C_CHAR.withName("contents_encryption_mode"),
        liburing_h.C_CHAR.withName("filenames_encryption_mode"),
        liburing_h.C_CHAR.withName("flags"),
        MemoryLayout.sequenceLayout(4, liburing_h.C_CHAR).withName("__reserved"),
        MemoryLayout.sequenceLayout(16, liburing_h.C_CHAR).withName("master_key_identifier")
    ).withName("fscrypt_policy_v2");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfByte version$LAYOUT = (OfByte)$LAYOUT.select(groupElement("version"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u8 version
     * }
     */
    public static final OfByte version$layout() {
        return version$LAYOUT;
    }

    private static final long version$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u8 version
     * }
     */
    public static final long version$offset() {
        return version$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u8 version
     * }
     */
    public static byte version(MemorySegment struct) {
        return struct.get(version$LAYOUT, version$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u8 version
     * }
     */
    public static void version(MemorySegment struct, byte fieldValue) {
        struct.set(version$LAYOUT, version$OFFSET, fieldValue);
    }

    private static final OfByte contents_encryption_mode$LAYOUT = (OfByte)$LAYOUT.select(groupElement("contents_encryption_mode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u8 contents_encryption_mode
     * }
     */
    public static final OfByte contents_encryption_mode$layout() {
        return contents_encryption_mode$LAYOUT;
    }

    private static final long contents_encryption_mode$OFFSET = 1;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u8 contents_encryption_mode
     * }
     */
    public static final long contents_encryption_mode$offset() {
        return contents_encryption_mode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u8 contents_encryption_mode
     * }
     */
    public static byte contents_encryption_mode(MemorySegment struct) {
        return struct.get(contents_encryption_mode$LAYOUT, contents_encryption_mode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u8 contents_encryption_mode
     * }
     */
    public static void contents_encryption_mode(MemorySegment struct, byte fieldValue) {
        struct.set(contents_encryption_mode$LAYOUT, contents_encryption_mode$OFFSET, fieldValue);
    }

    private static final OfByte filenames_encryption_mode$LAYOUT = (OfByte)$LAYOUT.select(groupElement("filenames_encryption_mode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u8 filenames_encryption_mode
     * }
     */
    public static final OfByte filenames_encryption_mode$layout() {
        return filenames_encryption_mode$LAYOUT;
    }

    private static final long filenames_encryption_mode$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u8 filenames_encryption_mode
     * }
     */
    public static final long filenames_encryption_mode$offset() {
        return filenames_encryption_mode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u8 filenames_encryption_mode
     * }
     */
    public static byte filenames_encryption_mode(MemorySegment struct) {
        return struct.get(filenames_encryption_mode$LAYOUT, filenames_encryption_mode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u8 filenames_encryption_mode
     * }
     */
    public static void filenames_encryption_mode(MemorySegment struct, byte fieldValue) {
        struct.set(filenames_encryption_mode$LAYOUT, filenames_encryption_mode$OFFSET, fieldValue);
    }

    private static final OfByte flags$LAYOUT = (OfByte)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u8 flags
     * }
     */
    public static final OfByte flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 3;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u8 flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u8 flags
     * }
     */
    public static byte flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u8 flags
     * }
     */
    public static void flags(MemorySegment struct, byte fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    private static final SequenceLayout __reserved$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("__reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u8 __reserved[4]
     * }
     */
    public static final SequenceLayout __reserved$layout() {
        return __reserved$LAYOUT;
    }

    private static final long __reserved$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u8 __reserved[4]
     * }
     */
    public static final long __reserved$offset() {
        return __reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u8 __reserved[4]
     * }
     */
    public static MemorySegment __reserved(MemorySegment struct) {
        return struct.asSlice(__reserved$OFFSET, __reserved$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u8 __reserved[4]
     * }
     */
    public static void __reserved(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, __reserved$OFFSET, __reserved$LAYOUT.byteSize());
    }

    private static long[] __reserved$DIMS = { 4 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * __u8 __reserved[4]
     * }
     */
    public static long[] __reserved$dimensions() {
        return __reserved$DIMS;
    }
    private static final VarHandle __reserved$ELEM_HANDLE = __reserved$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * __u8 __reserved[4]
     * }
     */
    public static byte __reserved(MemorySegment struct, long index0) {
        return (byte)__reserved$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * __u8 __reserved[4]
     * }
     */
    public static void __reserved(MemorySegment struct, long index0, byte fieldValue) {
        __reserved$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout master_key_identifier$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("master_key_identifier"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __u8 master_key_identifier[16]
     * }
     */
    public static final SequenceLayout master_key_identifier$layout() {
        return master_key_identifier$LAYOUT;
    }

    private static final long master_key_identifier$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __u8 master_key_identifier[16]
     * }
     */
    public static final long master_key_identifier$offset() {
        return master_key_identifier$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __u8 master_key_identifier[16]
     * }
     */
    public static MemorySegment master_key_identifier(MemorySegment struct) {
        return struct.asSlice(master_key_identifier$OFFSET, master_key_identifier$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __u8 master_key_identifier[16]
     * }
     */
    public static void master_key_identifier(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, master_key_identifier$OFFSET, master_key_identifier$LAYOUT.byteSize());
    }

    private static long[] master_key_identifier$DIMS = { 16 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * __u8 master_key_identifier[16]
     * }
     */
    public static long[] master_key_identifier$dimensions() {
        return master_key_identifier$DIMS;
    }
    private static final VarHandle master_key_identifier$ELEM_HANDLE = master_key_identifier$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * __u8 master_key_identifier[16]
     * }
     */
    public static byte master_key_identifier(MemorySegment struct, long index0) {
        return (byte)master_key_identifier$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * __u8 master_key_identifier[16]
     * }
     */
    public static void master_key_identifier(MemorySegment struct, long index0, byte fieldValue) {
        master_key_identifier$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

