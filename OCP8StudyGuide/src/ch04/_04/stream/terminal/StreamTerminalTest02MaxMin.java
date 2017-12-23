package ch04._04.stream.terminal;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamTerminalTest02MaxMin {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("monkey", "ape", "bonobo");
		//
		Optional<String> minLength = s.min((e1, e2) -> e1.length() - e2.length());
		System.out.println(minLength.get());
	}
}
