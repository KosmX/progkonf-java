// Generated by jextract

package se.curl;

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
 * struct sockaddr_storage {
 *     sa_family_t ss_family;
 *     char __ss_padding[118];
 *     unsigned long __ss_align;
 * }
 * }
 */
public class sockaddr_storage {

    sockaddr_storage() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        curl_h.C_SHORT.withName("ss_family"),
        MemoryLayout.sequenceLayout(118, curl_h.C_CHAR).withName("__ss_padding"),
        curl_h.C_LONG.withName("__ss_align")
    ).withName("sockaddr_storage");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort ss_family$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ss_family"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * sa_family_t ss_family
     * }
     */
    public static final OfShort ss_family$layout() {
        return ss_family$LAYOUT;
    }

    private static final long ss_family$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * sa_family_t ss_family
     * }
     */
    public static final long ss_family$offset() {
        return ss_family$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * sa_family_t ss_family
     * }
     */
    public static short ss_family(MemorySegment struct) {
        return struct.get(ss_family$LAYOUT, ss_family$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * sa_family_t ss_family
     * }
     */
    public static void ss_family(MemorySegment struct, short fieldValue) {
        struct.set(ss_family$LAYOUT, ss_family$OFFSET, fieldValue);
    }

    private static final SequenceLayout __ss_padding$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("__ss_padding"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char __ss_padding[118]
     * }
     */
    public static final SequenceLayout __ss_padding$layout() {
        return __ss_padding$LAYOUT;
    }

    private static final long __ss_padding$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char __ss_padding[118]
     * }
     */
    public static final long __ss_padding$offset() {
        return __ss_padding$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char __ss_padding[118]
     * }
     */
    public static MemorySegment __ss_padding(MemorySegment struct) {
        return struct.asSlice(__ss_padding$OFFSET, __ss_padding$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char __ss_padding[118]
     * }
     */
    public static void __ss_padding(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, __ss_padding$OFFSET, __ss_padding$LAYOUT.byteSize());
    }

    private static long[] __ss_padding$DIMS = { 118 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * char __ss_padding[118]
     * }
     */
    public static long[] __ss_padding$dimensions() {
        return __ss_padding$DIMS;
    }
    private static final VarHandle __ss_padding$ELEM_HANDLE = __ss_padding$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * char __ss_padding[118]
     * }
     */
    public static byte __ss_padding(MemorySegment struct, long index0) {
        return (byte)__ss_padding$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * char __ss_padding[118]
     * }
     */
    public static void __ss_padding(MemorySegment struct, long index0, byte fieldValue) {
        __ss_padding$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfLong __ss_align$LAYOUT = (OfLong)$LAYOUT.select(groupElement("__ss_align"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long __ss_align
     * }
     */
    public static final OfLong __ss_align$layout() {
        return __ss_align$LAYOUT;
    }

    private static final long __ss_align$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long __ss_align
     * }
     */
    public static final long __ss_align$offset() {
        return __ss_align$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long __ss_align
     * }
     */
    public static long __ss_align(MemorySegment struct) {
        return struct.get(__ss_align$LAYOUT, __ss_align$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long __ss_align
     * }
     */
    public static void __ss_align(MemorySegment struct, long fieldValue) {
        struct.set(__ss_align$LAYOUT, __ss_align$OFFSET, fieldValue);
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

