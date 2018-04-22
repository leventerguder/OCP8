package ch04._04.stream.intermediate;

import java.util.stream.Stream;

public class StreamIntermediateTest02Distinct {

	public static void main(String[] args) {

		Stream<String> s = Stream.of("duck", "duck", "duck", "goose");
		s.distinct().forEach(System.out::print);
	}
}
