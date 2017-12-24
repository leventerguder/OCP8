package ch04._07.reviewQuestions;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Qx14 {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(1);
		IntStream is = s.mapToInt(x -> x);
		DoubleStream ds = s.mapToDouble(x -> x);
		// java.lang.IllegalStateException: stream has already been operated
		// upon or closed

		// Stream<Integer> s2 = ds.mapToInt(x -> x);
		// compiler error
	}
}
