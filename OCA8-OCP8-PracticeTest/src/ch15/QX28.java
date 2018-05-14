package ch15;

import java.util.stream.Stream;

public class QX28 {

	public static void main(String[] args) {
		Stream<Character> chars = Stream.generate(() -> 'a');
		chars.filter(c -> c < 'b').sorted().findFirst().ifPresent(System.out::print);
		// C. The code enters an infinite loop.
	}
}
