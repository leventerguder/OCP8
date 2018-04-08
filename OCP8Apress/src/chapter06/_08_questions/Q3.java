package chapter06._08_questions;

import java.util.stream.Stream;

public class Q3 {

	public static void main(String[] args) {

		boolean result = Stream.of("do", "re", "mi", "fa", "so", "la", "ti").filter(str -> str.length() > 5)
				.peek(System.out::println).allMatch(str -> str.length() > 5);

		System.out.println(result);
	}
}

// The allMatch() method returns true for an empty stream and does not evaluate
// the given predicate.
// hence this program prints true.