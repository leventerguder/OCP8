package ch04._04.stream.terminal;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamTerminalTest03Find {

	public static void main(String[] args) {
		// Optional<T> findAny()
		// Optional<T> findFirst()
		Stream<String> s1 = Stream.of("oracle", "java8");
		Optional<String> opt = s1.findAny();

		System.out.println(opt);

		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		Stream<String> infinite = Stream.generate(() -> "chimp");
		s.findAny().ifPresent(System.out::println); // monkey
		infinite.findAny().ifPresent(System.out::println); // chimp
	}
}
