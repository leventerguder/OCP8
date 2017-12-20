package ch04._05.stream.terminal;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamTerminalTest03Find {

	public static void main(String[] args) {
		// Optional<T> findAny()
		// Optional<T> findFirst()
		Stream<String> s1 = Stream.of("oracle", "java8");
		Optional<String> opt = s1.findAny();
		
		System.out.println(opt);
	}
}
