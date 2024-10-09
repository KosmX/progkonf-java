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
 * struct itimerspec {
 *     struct timespec it_interval;
 *     struct timespec it_value;
 * }
 * }
 */
public class itimerspec {

    itimerspec() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        timespec.layout().withName("it_interval"),
        timespec.layout().withName("it_value")
    ).withName("itimerspec");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout it_interval$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("it_interval"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct timespec it_interval
     * }
     */
    public static final GroupLayout it_interval$layout() {
        return it_interval$LAYOUT;
    }

    private static final long it_interval$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct timespec it_interval
     * }
     */
    public static final long it_interval$offset() {
        return it_interval$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct timespec it_interval
     * }
     */
    public static MemorySegment it_interval(MemorySegment struct) {
        return struct.asSlice(it_interval$OFFSET, it_interval$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct timespec it_interval
     * }
     */
    public static void it_interval(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, it_interval$OFFSET, it_interval$LAYOUT.byteSize());
    }

    private static final GroupLayout it_value$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("it_value"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct timespec it_value
     * }
     */
    public static final GroupLayout it_value$layout() {
        return it_value$LAYOUT;
    }

    private static final long it_value$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct timespec it_value
     * }
     */
    public static final long it_value$offset() {
        return it_value$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct timespec it_value
     * }
     */
    public static MemorySegment it_value(MemorySegment struct) {
        return struct.asSlice(it_value$OFFSET, it_value$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct timespec it_value
     * }
     */
    public static void it_value(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, it_value$OFFSET, it_value$LAYOUT.byteSize());
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

