package ch04._05.stream.terminal;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class StreamTerminalTest08Reduce {

	public static void main(String[] args) {
		BinaryOperator<Integer> bo = (a, b) -> a * b;
		Stream<Integer> empty = Stream.empty();
		Stream<Integer> oneElement = Stream.of(3);
		Stream<Integer> threeElement = Stream.of(3, 5, 7);
		//

		Optional<Integer> opt1 = empty.reduce(bo);
		System.out.println(opt1);
		//
		Optional<Integer> opt2 = oneElement.reduce(bo);
		System.out.println(opt2);
		//
		Optional<Integer> opt3 = threeElement.reduce(bo);
		System.out.println(opt3);

		// If the stream is empty, an empty Optional is returned.
		// If the stream has one element, it is returned.
		// If the stream has multiple elements, the accumulator is applied to
		// combine them.

	}
}
