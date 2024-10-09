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
 * struct curl_khkey {
 *     const char *key;
 *     size_t len;
 *     enum curl_khtype keytype;
 * }
 * }
 */
public class curl_khkey {

    curl_khkey() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        curl_h.C_POINTER.withName("key"),
        curl_h.C_LONG.withName("len"),
        curl_h.C_INT.withName("keytype"),
        MemoryLayout.paddingLayout(4)
    ).withName("curl_khkey");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout key$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("key"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const char *key
     * }
     */
    public static final AddressLayout key$layout() {
        return key$LAYOUT;
    }

    private static final long key$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const char *key
     * }
     */
    public static final long key$offset() {
        return key$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const char *key
     * }
     */
    public static MemorySegment key(MemorySegment struct) {
        return struct.get(key$LAYOUT, key$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const char *key
     * }
     */
    public static void key(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(key$LAYOUT, key$OFFSET, fieldValue);
    }

    private static final OfLong len$LAYOUT = (OfLong)$LAYOUT.select(groupElement("len"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * size_t len
     * }
     */
    public static final OfLong len$layout() {
        return len$LAYOUT;
    }

    private static final long len$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * size_t len
     * }
     */
    public static final long len$offset() {
        return len$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * size_t len
     * }
     */
    public static long len(MemorySegment struct) {
        return struct.get(len$LAYOUT, len$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * size_t len
     * }
     */
    public static void len(MemorySegment struct, long fieldValue) {
        struct.set(len$LAYOUT, len$OFFSET, fieldValue);
    }

    private static final OfInt keytype$LAYOUT = (OfInt)$LAYOUT.select(groupElement("keytype"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * enum curl_khtype keytype
     * }
     */
    public static final OfInt keytype$layout() {
        return keytype$LAYOUT;
    }

    private static final long keytype$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * enum curl_khtype keytype
     * }
     */
    public static final long keytype$offset() {
        return keytype$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * enum curl_khtype keytype
     * }
     */
    public static int keytype(MemorySegment struct) {
        return struct.get(keytype$LAYOUT, keytype$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * enum curl_khtype keytype
     * }
     */
    public static void keytype(MemorySegment struct, int fieldValue) {
        struct.set(keytype$LAYOUT, keytype$OFFSET, fieldValue);
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

