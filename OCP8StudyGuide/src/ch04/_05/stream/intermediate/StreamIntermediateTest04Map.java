package ch04._05.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamIntermediateTest04Map {

	// The flatMap() method takes each element in the stream and makes any
	// elements it contains toplevel elements in a single stream. This is
	// helpful when you want to remove empty elements from a stream or you want
	// to combine a stream of lists
	public static void main(String[] args) {
		//
		List<String> zero = Arrays.asList();
		List<String> one = Arrays.asList("Bonobo");
		List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
		//
		Stream<List<String>> animals = Stream.of(zero, one, two);
		animals.flatMap((List<String> l) -> l.stream()).forEach((String x) -> System.out.println(x));
	}
}

// <R> Stream<R> map(Function<? super T, ? extends R> mapper);
// <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>>
// mapper);