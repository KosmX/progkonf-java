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
 * struct curl_waitfd {
 *     curl_socket_t fd;
 *     short events;
 *     short revents;
 * }
 * }
 */
public class curl_waitfd {

    curl_waitfd() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        curl_h.C_INT.withName("fd"),
        curl_h.C_SHORT.withName("events"),
        curl_h.C_SHORT.withName("revents")
    ).withName("curl_waitfd");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt fd$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fd"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * curl_socket_t fd
     * }
     */
    public static final OfInt fd$layout() {
        return fd$LAYOUT;
    }

    private static final long fd$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * curl_socket_t fd
     * }
     */
    public static final long fd$offset() {
        return fd$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * curl_socket_t fd
     * }
     */
    public static int fd(MemorySegment struct) {
        return struct.get(fd$LAYOUT, fd$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * curl_socket_t fd
     * }
     */
    public static void fd(MemorySegment struct, int fieldValue) {
        struct.set(fd$LAYOUT, fd$OFFSET, fieldValue);
    }

    private static final OfShort events$LAYOUT = (OfShort)$LAYOUT.select(groupElement("events"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * short events
     * }
     */
    public static final OfShort events$layout() {
        return events$LAYOUT;
    }

    private static final long events$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * short events
     * }
     */
    public static final long events$offset() {
        return events$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * short events
     * }
     */
    public static short events(MemorySegment struct) {
        return struct.get(events$LAYOUT, events$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * short events
     * }
     */
    public static void events(MemorySegment struct, short fieldValue) {
        struct.set(events$LAYOUT, events$OFFSET, fieldValue);
    }

    private static final OfShort revents$LAYOUT = (OfShort)$LAYOUT.select(groupElement("revents"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * short revents
     * }
     */
    public static final OfShort revents$layout() {
        return revents$LAYOUT;
    }

    private static final long revents$OFFSET = 6;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * short revents
     * }
     */
    public static final long revents$offset() {
        return revents$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * short revents
     * }
     */
    public static short revents(MemorySegment struct) {
        return struct.get(revents$LAYOUT, revents$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * short revents
     * }
     */
    public static void revents(MemorySegment struct, short fieldValue) {
        struct.set(revents$LAYOUT, revents$OFFSET, fieldValue);
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

