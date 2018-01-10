package chapter11._12.stream;

import java.util.Arrays;

class StringConcatenator {
	public static String result = "";

	public static void concatStr(String str) {
		result = result + " " + str;
	}
}

class Test03StringSplitAndConcatenate {
	public static void main(String[] args) {
		String words[] = "the quick brown fox jumps over the lazy dog".split(" ");
		Arrays.stream(words).forEach(StringConcatenator::concatStr);
		System.out.println(StringConcatenator.result);
	}
}
