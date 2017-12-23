package ch04._04.stream.terminal;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamTerminalTest06Reduce {

	public static void main(String[] args) {
		String[] array = new String[] { "w", "o", "l", "f" };
		String result = "";
		for (String s : array)
			result = result + s;
		System.out.println(result);
		//
		Stream<String> stream = Stream.of("w", "o", "l", "f");
		Optional<String> reduced = stream.reduce((e1, e2) -> e1 + e2);
		System.out.println(reduced.get());

		Stream<String> stream2 = Stream.of("w", "o", "l", "f");
		String reduced2 = stream2.reduce("", (e1, e2) -> e1 + e2);
		System.out.println(reduced2);

		Stream<String> stream3 = Stream.of("w", "o", "l", "f");
		String reduced3 = stream3.reduce("", String::concat);
		System.out.println(reduced3);
	}
}
