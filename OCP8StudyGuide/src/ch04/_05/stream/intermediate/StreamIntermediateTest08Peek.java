package ch04._05.stream.intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamIntermediateTest08Peek {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		List<Character> letters = new ArrayList<>();
		numbers.add(10);
		letters.add('a');
		Stream<List<?>> stream = Stream.of(numbers, letters);
		stream.map(List::size).forEach(System.out::print); // 11

		System.out.println();
		StringBuilder builder = new StringBuilder();
		Stream<List<?>> good = Stream.of(numbers, letters);
		good.peek(l -> builder.append(l)).map(List::size).forEach(System.out::print);

		System.out.println();
		Stream<List<?>> bad = Stream.of(numbers, letters);
		bad.peek(l -> l.remove(0)).map(List::size).forEach(System.out::print); // 00
		// This example is bad because peek() is modifying the data structure
		// that is used in the stream, which causes the result of the stream
		// pipeline to be different than if the peek wasn’t present.

		System.out.println();
		System.out.println(numbers);
		System.out.println(letters);
	}
}
