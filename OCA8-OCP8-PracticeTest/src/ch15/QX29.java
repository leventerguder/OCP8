package ch15;

import java.util.function.LongToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class QX29 {

	public static void main(String[] args) {

		LongStream stream = LongStream.of(9);
		// stream.mapToDouble(p -> p).forEach(System.out::println); // 9.0
		// IntStream mapToInt(LongToIntFunction mapper);
		// stream.mapToInt(p -> p).forEach(System.out::println); //compile error

		stream.map(p -> p).forEach(System.out::println);
	}
}
