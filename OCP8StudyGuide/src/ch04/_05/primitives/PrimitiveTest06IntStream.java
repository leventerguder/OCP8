package ch04._05.primitives;

import java.util.stream.IntStream;

public class PrimitiveTest06IntStream {

	public static void main(String[] args) {
		IntStream range = IntStream.range(1, 6);
		range.forEach(System.out::print);
		//
		System.out.println();
		IntStream rangeClosed = IntStream.rangeClosed(1, 6);
		rangeClosed.forEach(System.out::print);
	}
}
