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
 * typedef curl_socket_t (*curl_opensocket_callback)(void *, curlsocktype, struct curl_sockaddr {
 *     int family;
 *     int socktype;
 *     int protocol;
 *     unsigned int addrlen;
 *     struct sockaddr addr;
 * } *)
 * }
 */
public class curl_opensocket_callback {

    curl_opensocket_callback() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        int apply(MemorySegment clientp, int purpose, MemorySegment address);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        curl_h.C_INT,
        curl_h.C_POINTER,
        curl_h.C_INT,
        curl_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = curl_h.upcallHandle(curl_opensocket_callback.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(curl_opensocket_callback.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static int invoke(MemorySegment funcPtr,MemorySegment clientp, int purpose, MemorySegment address) {
        try {
            return (int) DOWN$MH.invokeExact(funcPtr, clientp, purpose, address);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

