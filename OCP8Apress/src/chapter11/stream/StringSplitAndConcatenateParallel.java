package chapter11.stream;

import java.util.Arrays;

class StringConcatenator2 {
	public static String result = "";

	public static void concatStr(String str) {
		result = result + " " + str;
	}
}

class StringSplitAndConcatenateParallel {
	public static void main(String[] args) {
		String words[] = "the quick brown fox jumps over the lazy dog".split(" ");
		Arrays.stream(words).parallel().forEach(StringConcatenator2::concatStr);
		System.out.println(StringConcatenator2.result);
		// When the stream is parallel, the task is split into multiple
		// sub-tasks and different threads execute it.
	}
}
