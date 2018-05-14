package ch15;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class QX25 {

	public static void main(String[] args) {

		IntStream ints = IntStream.empty();
		IntStream moreInts = IntStream.of(66, 77, 88);

		// Stream.of(ints, moreInts).flatMap(x -> x).forEach(System.out::println);
		Stream.of(ints, moreInts).flatMapToInt(x -> x).forEach(System.out::println);
	}
}
