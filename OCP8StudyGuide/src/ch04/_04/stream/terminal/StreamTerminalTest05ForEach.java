package ch04._04.stream.terminal;

import java.util.stream.Stream;

public class StreamTerminalTest05ForEach {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
		s.forEach(System.out::print); // MonkeyGorillaBonobo
	}
}
