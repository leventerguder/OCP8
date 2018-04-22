package ch04._04.stream.terminal;

import java.util.stream.Stream;

public class StreamTerminalTest05ForEach {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
		s.forEach(System.out::print); // MonkeyGorillaBonobo
	}
}
// forEach() on an infinite stream does not terminate. Since there is no return
// value, it is not a reduction.
// Streams cannot use a traditional for loop to run because they don’t implement
// the Iterable interface.