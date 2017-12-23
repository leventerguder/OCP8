package ch04._04.stream.together;

import java.util.stream.Stream;

public class PipelineTest02 {

	public static void main(String[] args) {

		Stream<Integer> infinite = Stream.iterate(1, x -> x + 1); // 1 2 3 4 5
		infinite.limit(5).filter(x -> x % 2 == 1).forEach(System.out::print);
		// 1 3 5

		System.out.println();
		// Reversing the order of the intermediate operations changes the
		// result:
		Stream<Integer> infinite2 = Stream.iterate(1, x -> x + 1);
		infinite2.filter(x -> x % 2 == 1).limit(5).forEach(System.out::print); // 13579

		System.out.println();
		//
		Stream<Integer> infinite3 = Stream.iterate(1, x -> x + 1);
		infinite3.filter(x -> x % 2 == 1).peek(System.out::print).limit(5).forEach(System.out::print);
	}
}
