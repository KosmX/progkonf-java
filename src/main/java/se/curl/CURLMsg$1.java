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
 * struct CURLMsg {
 *     CURLMSG msg;
 *     CURL *easy_handle;
 *     union {
 *         void *whatever;
 *         CURLcode result;
 *     } data;
 * }
 * }
 */
public class CURLMsg$1 {

    CURLMsg$1() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        curl_h.C_INT.withName("msg"),
        MemoryLayout.paddingLayout(4),
        curl_h.C_POINTER.withName("easy_handle"),
        CURLMsg$1.data.layout().withName("data")
    ).withName("CURLMsg");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt msg$LAYOUT = (OfInt)$LAYOUT.select(groupElement("msg"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CURLMSG msg
     * }
     */
    public static final OfInt msg$layout() {
        return msg$LAYOUT;
    }

    private static final long msg$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CURLMSG msg
     * }
     */
    public static final long msg$offset() {
        return msg$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CURLMSG msg
     * }
     */
    public static int msg(MemorySegment struct) {
        return struct.get(msg$LAYOUT, msg$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CURLMSG msg
     * }
     */
    public static void msg(MemorySegment struct, int fieldValue) {
        struct.set(msg$LAYOUT, msg$OFFSET, fieldValue);
    }

    private static final AddressLayout easy_handle$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("easy_handle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CURL *easy_handle
     * }
     */
    public static final AddressLayout easy_handle$layout() {
        return easy_handle$LAYOUT;
    }

    private static final long easy_handle$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CURL *easy_handle
     * }
     */
    public static final long easy_handle$offset() {
        return easy_handle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CURL *easy_handle
     * }
     */
    public static MemorySegment easy_handle(MemorySegment struct) {
        return struct.get(easy_handle$LAYOUT, easy_handle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CURL *easy_handle
     * }
     */
    public static void easy_handle(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(easy_handle$LAYOUT, easy_handle$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * union {
     *     void *whatever;
     *     CURLcode result;
     * }
     * }
     */
    public static class data {

        data() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            curl_h.C_POINTER.withName("whatever"),
            curl_h.C_INT.withName("result")
        ).withName("$anon$104:3");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final AddressLayout whatever$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("whatever"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * void *whatever
         * }
         */
        public static final AddressLayout whatever$layout() {
            return whatever$LAYOUT;
        }

        private static final long whatever$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * void *whatever
         * }
         */
        public static final long whatever$offset() {
            return whatever$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * void *whatever
         * }
         */
        public static MemorySegment whatever(MemorySegment union) {
            return union.get(whatever$LAYOUT, whatever$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * void *whatever
         * }
         */
        public static void whatever(MemorySegment union, MemorySegment fieldValue) {
            union.set(whatever$LAYOUT, whatever$OFFSET, fieldValue);
        }

        private static final OfInt result$LAYOUT = (OfInt)$LAYOUT.select(groupElement("result"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * CURLcode result
         * }
         */
        public static final OfInt result$layout() {
            return result$LAYOUT;
        }

        private static final long result$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * CURLcode result
         * }
         */
        public static final long result$offset() {
            return result$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * CURLcode result
         * }
         */
        public static int result(MemorySegment union) {
            return union.get(result$LAYOUT, result$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * CURLcode result
         * }
         */
        public static void result(MemorySegment union, int fieldValue) {
            union.set(result$LAYOUT, result$OFFSET, fieldValue);
        }

        /**
         * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
         * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
         */
        public static MemorySegment asSlice(MemorySegment array, long index) {
            return array.asSlice(layout().byteSize() * index);
        }

        /**
         * The size (in bytes) of this union
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

    private static final GroupLayout data$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("data"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * union {
     *     void *whatever;
     *     CURLcode result;
     * } data
     * }
     */
    public static final GroupLayout data$layout() {
        return data$LAYOUT;
    }

    private static final long data$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union {
     *     void *whatever;
     *     CURLcode result;
     * } data
     * }
     */
    public static final long data$offset() {
        return data$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union {
     *     void *whatever;
     *     CURLcode result;
     * } data
     * }
     */
    public static MemorySegment data(MemorySegment struct) {
        return struct.asSlice(data$OFFSET, data$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union {
     *     void *whatever;
     *     CURLcode result;
     * } data
     * }
     */
    public static void data(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, data$OFFSET, data$LAYOUT.byteSize());
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

