package cheshire.playground;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.VarHandle;

public class AcquireReleasePlayground {

    // Define a simpler memory layout for testing
    public static final GroupLayout layout = MemoryLayout.structLayout(
            ValueLayout.JAVA_INT.withName("test_int").withByteAlignment(4))
            .withName("test_layout");

    private static VarHandle intVarHandle = layout.varHandle(PathElement.groupElement("test_int"));

    public static void main(String[] args) {
        try {
            try (Arena memorySession = Arena.ofConfined()) {
                // Allocate native memory according to the layout
                MemorySegment segment = memorySession.allocate(layout);

                // Set a value for testing
                intVarHandle.set(segment, 0, 12345);

                // Attempt to get the value using GET_ACQUIRE or fallback to GET
                try {
                    if (intVarHandle.isAccessModeSupported(VarHandle.AccessMode.GET_ACQUIRE)) {
                        System.out.println("GET_ACQUIRE is supported.");
                        int value = (int) intVarHandle.getAcquire(segment, 0);
                        System.out.println("Value from getAcquire: " + value);
                    } else {
                        System.out.println("GET_ACQUIRE is NOT supported. Falling back to GET.");
                        int value = (int) intVarHandle.get(segment, 0);
                        System.out.println("Value from get: " + value);
                    }
                } catch (UnsupportedOperationException e) {
                    System.err.println("GET_ACQUIRE is not supported for this layout: " + e.getMessage());
                }

            } catch (UnsupportedOperationException e) {
                System.err.println("UnsupportedOperationException: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("Exception: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
