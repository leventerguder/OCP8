package chapter04;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSources {

	public static void main(String[] args) {
		IntStream is = IntStream.range(1, 6);
		is.forEach(System.out::println);

		System.out.println();
		//
		IntStream.iterate(2, i -> i + 3).limit(6).forEach(System.out::println);

		//
		IntStream intStream = Arrays.stream(new int[] { 1, 2, 3 }); // !!
		Stream<Integer> si = Arrays.stream(new Integer[] { 1, 2, 3 }); // !!

		//
		IntStream intStream2 = IntStream.of(1, 2, 3);

		Stream<Integer> si2 = Stream.of(1, 2, 3);

		//
		Stream.builder().add(1).add(2).add(3).build();
		
		System.out.println();
		IntStream.rangeClosed(1, 1).forEach(System.out::println);
	}
}
