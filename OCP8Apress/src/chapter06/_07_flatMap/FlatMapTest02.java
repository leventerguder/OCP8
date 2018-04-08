package chapter06._07_flatMap;

import java.util.Arrays;
import java.util.List;

public class FlatMapTest02 {

	public static void main(String[] args) {
		//
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.stream().map(i -> i * i).forEach(System.out::println);

		//
		List<Integer[]> listArray = Arrays.asList(new Integer[] { 1, 3, 5 }, new Integer[] { 2, 4 });
		// listArray.stream().map(i -> i * i).forEach(System.out::println); //
		// compiler error
		listArray.stream().flatMap(array -> Arrays.stream(array)).sorted().map(i -> i * i).forEach(System.out::println);
	}
}

// <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);

// flatMap method operates on elements just like map() method.
// However flatMap flattens the streams that result from mapping each of its elements into one flat stream.