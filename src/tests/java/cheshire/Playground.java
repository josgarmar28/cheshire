package tests.java.cheshire;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

public class Playground {
    public static void main(String[] args) {
        Linker nativeLinker = Linker.nativeLinker();
        SymbolLookup stdlibLookup = nativeLinker.defaultLookup();
        SymbolLookup loaderLookup = SymbolLookup.loaderLookup();
        
        FunctionDescriptor printfDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);

        String symbolName = "printf";
        String greeting = "Hello World from Project Panama Baeldung Article";
        MethodHandle methodHandle = loaderLookup.find(symbolName)
        .or(() -> stdlibLookup.find(symbolName))
        .map(symbolSegment -> nativeLinker.downcallHandle(symbolSegment, printfDescriptor))
        .orElse(null);

        try (Arena memorySession = Arena.ofConfined()) {
            MemorySegment greetingSegment = memorySession.allocateUtf8String(greeting);
            methodHandle.invoke(greetingSegment);
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
