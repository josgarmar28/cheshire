package cheshire;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public class utils {
	/*
	 * Assuming
	 * "segment == MemorySegment.NULL" (Java code)
	 * is equals to
	 * "ptr == null" or "!ptr" (C code)
	 */
	public static boolean areSegmentsEquals(MemorySegment s1, MemorySegment s2) {
		return (s1.address() == s2.address()) && (s1.byteSize() == s2.byteSize());
	}

	public static int getIntFromSegment(MemorySegment s) {
		return s.reinterpret(ValueLayout.JAVA_INT.byteSize()).get(ValueLayout.JAVA_INT, 0);
	}

	public static void setIntFromSegment(MemorySegment s, int value) {
		s.reinterpret(ValueLayout.JAVA_INT.byteSize()).set(ValueLayout.JAVA_INT, 0, value);
	}
}