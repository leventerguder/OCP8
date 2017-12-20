package ch04._05.stream.terminal;

import java.util.stream.Stream;

public class StreamTerminalTest01Count {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("in", "java", "we", "trust");
		System.out.println(s.count());
	}
}
