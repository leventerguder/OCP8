package _51.stream;

import java.util.Arrays;

public class StreamForEach {

	public static void main(String[] args) {
		Integer[] data = { 7, 2, 3, 4, 5, 6, 15, 8 };
		Arrays.stream(data).filter(num -> num % 2 == 1).forEach(s -> System.out.print(s + " "));
		
		System.out.println();
		Arrays.stream(data).filter(num -> num % 2 == 1).forEachOrdered(s -> System.out.print(s + " "));
	}
}
