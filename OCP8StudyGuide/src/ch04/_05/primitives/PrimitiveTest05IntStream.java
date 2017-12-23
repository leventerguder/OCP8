package ch04._05.primitives;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveTest05IntStream {

	public static void main(String[] args) {
		IntStream is = IntStream.iterate(1, n -> n + 1).limit(5);
		is.forEach(System.out::println);

		System.out.println();
		Stream<Integer> s = Stream.iterate(1, n -> n + 1).limit(5);
		s.forEach(System.out::println);
	}
}
