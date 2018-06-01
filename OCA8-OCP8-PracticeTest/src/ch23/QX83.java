package ch23;

import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QX83 {

	public static void main(String[] args) {

		Stream<String> s = Stream.of("speak", "bark", "meow", "growl");
		Map<Integer, String> map = s.collect(Collectors.toMap(String::length, k -> k));
		System.out.println(map.size() + " " + map.get(4));
		// java.lang.IllegalStateException: Duplicate key bark
		// The code compiles but throws an exception at runtime.
	}
}
