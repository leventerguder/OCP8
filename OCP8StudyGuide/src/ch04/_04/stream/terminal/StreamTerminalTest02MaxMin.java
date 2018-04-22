package ch04._04.stream.terminal;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamTerminalTest02MaxMin {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("monkey", "ape", "bonobo");
		//
		Optional<String> minLength = s.min((e1, e2) -> e1.length() - e2.length());
		System.out.println(minLength.get());

		Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
		System.out.println(minEmpty.isPresent()); // false
		// Since the stream is empty , the comparator is never called and no
		// value is present in the Optional
	}
}
