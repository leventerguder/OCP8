package ch04._06.advanced;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test08Joining {

	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("lions", "tigers", "bears");
		Stream<String> s2 = Stream.of("lions", "tigers", "bears");

		String joined = s1.collect(Collectors.joining());
		System.out.println(joined);

		String joined2 = s2.collect(Collectors.joining(","));
		System.out.println(joined2);
	}
}
