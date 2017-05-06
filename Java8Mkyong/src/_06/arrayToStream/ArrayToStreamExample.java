package _06.arrayToStream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayToStreamExample {

	public static void main(String[] args) {
		String[] array = { "a", "b", "c", "d", "e" };

		// Arrays.stream
		Stream<String> stream = Arrays.stream(array);
		stream.forEach(System.out::println);

		//
		// Stream.of
		Stream<String> stream2 = Stream.of(array);
		stream2.forEach(System.out::println);

		int[] intArray = { 1, 2, 3, 4, 5 };
		//
		IntStream intStream1 = Arrays.stream(intArray);
		intStream1.forEach(System.out::println);
		//

		Stream<int[]> intStream2 = Stream.of(intArray);
		//intStream2.forEach(System.out::println);
		// Cant print Stream<int[]> directly, convert / flat it to IntStream

		IntStream intStream3 = intStream2.flatMapToInt(x -> Arrays.stream(x));
		intStream3.forEach(System.out::println);

	}
}
