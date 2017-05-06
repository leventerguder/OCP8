package _11.flatMap;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapExample03 {

	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5, 6 };

		Stream<int[]> streamArray = Stream.of(intArray);

		IntStream is = streamArray.flatMapToInt(x -> Arrays.stream(x));
		is.forEach(System.out::println);
	}
}
