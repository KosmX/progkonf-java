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
 * typedef int (*curl_push_callback)(CURL *, CURL *, size_t, struct curl_pushheaders *, void *)
 * }
 */
public class curl_push_callback {

    curl_push_callback() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        int apply(MemorySegment parent, MemorySegment easy, long num_headers, MemorySegment headers, MemorySegment userp);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        curl_h.C_INT,
        curl_h.C_POINTER,
        curl_h.C_POINTER,
        curl_h.C_LONG,
        curl_h.C_POINTER,
        curl_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = curl_h.upcallHandle(curl_push_callback.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(curl_push_callback.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static int invoke(MemorySegment funcPtr,MemorySegment parent, MemorySegment easy, long num_headers, MemorySegment headers, MemorySegment userp) {
        try {
            return (int) DOWN$MH.invokeExact(funcPtr, parent, easy, num_headers, headers, userp);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

