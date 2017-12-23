package ch04._04.stream.intermediate;

import java.util.stream.Stream;

public class StreamIntermediateTest03LimitAndSkip {

	public static void main(String[] args) {
		
		Stream.iterate(1, x -> x+3).limit(5).forEach(x -> System.out.print(x + " ")); // 1 4 7 10 13
		//
		Stream<Integer> s1 = Stream.iterate(10, n -> n + 2);
		// 10,12,14,16,18,20,22,24
		s1.skip(5).limit(3).forEach(x -> System.out.println(x + " "));
	}
}
