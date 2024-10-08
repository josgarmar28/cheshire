package cheshire;

import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.VarHandle;

public final class io_sqring_offsets {

	public static final GroupLayout layout = MemoryLayout.structLayout(
			ValueLayout.JAVA_INT.withName("head"),
			ValueLayout.JAVA_INT.withName("tail"),
			ValueLayout.JAVA_INT.withName("ring_mask"),
			ValueLayout.JAVA_INT.withName("ring_entries"),
			ValueLayout.JAVA_INT.withName("flags"),
			ValueLayout.JAVA_INT.withName("dropped"),
			ValueLayout.JAVA_INT.withName("array"),
			ValueLayout.JAVA_INT.withName("resv1"),
			ValueLayout.JAVA_LONG.withName("user_addr"))
			.withName("io_sqring_offsets");

	private static VarHandle headVarHandle = layout.varHandle(PathElement.groupElement("head"));
	private static VarHandle tailVarHandle = layout.varHandle(PathElement.groupElement("tail"));
	private static VarHandle ringMaskVarHandle = layout.varHandle(PathElement.groupElement("ring_mask"));
	private static VarHandle ringEntriesVarHandle = layout.varHandle(PathElement.groupElement("ring_entries"));
	private static VarHandle flagsVarHandle = layout.varHandle(PathElement.groupElement("flags"));
	private static VarHandle droppedVarHandle = layout.varHandle(PathElement.groupElement("dropped"));
	private static VarHandle arrayVarHandle = layout.varHandle(PathElement.groupElement("array"));
	private static VarHandle userAddrVarHandle = layout.varHandle(PathElement.groupElement("user_addr"));

	public static int getHead(MemorySegment data) {
		return (int) headVarHandle.get(data, 0);
	};

	public static void setHead(MemorySegment data, int value) {
		headVarHandle.set(data, 0, value);
	};

	public static int getTail(MemorySegment data) {
		return (int) tailVarHandle.get(data, 0);
	};

	public static void setTail(MemorySegment data, int value) {
		tailVarHandle.set(data, 0, value);
	};

	public static int getRingMask(MemorySegment data) {
		return (int) ringMaskVarHandle.get(data, 0);
	};

	public static void setRingMask(MemorySegment data, int value) {
		ringMaskVarHandle.set(data, 0, value);
	};

	public static int getRingEntries(MemorySegment data) {
		return (int) ringEntriesVarHandle.get(data, 0);
	};

	public static void setRingEntries(MemorySegment data, int value) {
		ringEntriesVarHandle.set(data, 0, value);
	};

	public static int getDropped(MemorySegment data) {
		return (int) droppedVarHandle.get(data, 0);
	};

	public static void setDropped(MemorySegment data, int value) {
		droppedVarHandle.set(data, 0, value);
	};

	public static int getArray(MemorySegment data) {
		return (int) arrayVarHandle.get(data, 0);
	};

	public static void setArray(MemorySegment data, int value) {
		arrayVarHandle.set(data, 0, value);
	};

	public static int getFlags(MemorySegment data) {
		return (int) flagsVarHandle.get(data, 0);
	};

	public static void setFlags(MemorySegment data, int value) {
		flagsVarHandle.set(data, 0, value);
	};

	public static long getUserAddr(MemorySegment data) {
		return (long) userAddrVarHandle.get(data, 0);
	};

	public static void setUserAddr(MemorySegment data, long value) {
		userAddrVarHandle.set(data, 0, value);
	};

};
