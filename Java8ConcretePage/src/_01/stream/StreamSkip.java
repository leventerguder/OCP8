package _01.stream;

import java.util.Arrays;

public class StreamSkip {

	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 50, 60 };
		Arrays.stream(array).skip(3).forEach(s -> System.out.println(s + " "));
	}
}
