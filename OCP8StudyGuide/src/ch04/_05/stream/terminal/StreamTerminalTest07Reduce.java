package ch04._05.stream.terminal;

import java.util.stream.Stream;

public class StreamTerminalTest07Reduce {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(3, 5, 7);
		Integer reduced = stream.reduce(100, (x, y) -> x + y);
		System.out.println(reduced);
	}
}
