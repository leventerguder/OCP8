package ch15;

import java.util.stream.Stream;

public class Q4 {

	public static void main(String[] args) {
		//
		Stream<String> stream = Stream.of("base", "ball");
		stream.map(s -> s.length()).forEach(System.out::print);
		
		System.out.println();
		
		Stream<String> stream2 = Stream.of("base", "ball");
		stream2.mapToInt(s->s.length()).forEach(System.out::print);
		
	}
}
