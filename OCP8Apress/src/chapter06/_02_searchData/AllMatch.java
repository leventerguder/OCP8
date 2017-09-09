package chapter06._02_searchData;

import java.util.stream.Stream;

public class AllMatch {
	public static void main(String[] args) {
		Stream.of("do", "re", "mi", "fa", "so", "la", "ti").filter(str -> str.length() > 5)
				.forEach(System.out::println); // empty

		boolean result = Stream.of("do", "re", "mi", "fa", "so", "la", "ti").filter(str -> str.length() > 5)
				.peek(System.out::println).allMatch(str -> str.length() > 5);
		//
		System.out.println(result);
		// The allMatch() method returns true for an empty stream and does not
		// evalute the given predicate. Hence this program prints true.
	}
}
