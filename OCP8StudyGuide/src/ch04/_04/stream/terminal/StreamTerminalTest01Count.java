package ch04._04.stream.terminal;

import java.util.stream.Stream;

public class StreamTerminalTest01Count {
	// The count() method determines the number of elements in a finite stream.
	public static void main(String[] args) {
		Stream<String> s = Stream.of("in", "java", "we", "trust");
		System.out.println(s.count());
	}
}
