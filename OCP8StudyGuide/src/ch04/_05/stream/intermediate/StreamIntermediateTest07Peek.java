package ch04._05.stream.intermediate;

import java.util.stream.Stream;

public class StreamIntermediateTest07Peek {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly");
		long count = stream.filter(s -> s.startsWith("g")).peek(System.out::println).count(); 
		System.out.println(count);
	}
}
