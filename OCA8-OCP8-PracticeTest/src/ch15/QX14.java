package ch15;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class QX14 {

	public static void print(Stream<String> stream) {
		Consumer<String> print = System.out::println;
		stream.peek(print).peek(print).map(s -> s).peek(print).forEach(print);
	}
	
	public static void main(String[] args) {
		print(Stream.of("hi"));
	}

}
