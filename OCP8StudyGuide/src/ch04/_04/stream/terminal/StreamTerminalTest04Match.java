package ch04._04.stream.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTerminalTest04Match {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("monkey", "2", "chimp");
		Stream<String> infinite1 = Stream.generate(() -> "chimp");
		Stream<String> infinite2 = Stream.generate(() -> "chimp");
		Stream<String> infinite3 = Stream.generate(() -> "chimp");
		//
		Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
		System.out.println(list.stream().anyMatch(pred)); // true
		System.out.println(list.stream().allMatch(pred)); // false
		System.out.println(list.stream().noneMatch(pred)); // false

		System.out.println(infinite1.anyMatch(pred)); // true
		System.out.println(infinite2.noneMatch(pred)); // false
		// System.out.println(infinite3.allMatch(pred)); // hang!
	}
}
