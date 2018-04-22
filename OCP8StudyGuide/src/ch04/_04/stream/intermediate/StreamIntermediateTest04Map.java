package ch04._04.stream.intermediate;

import java.util.stream.Stream;

public class StreamIntermediateTest04Map {

	public static void main(String[] args) {

		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		s.map(String::length).forEach(System.out::print); // 676
	}
}
