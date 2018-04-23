package ch04._06.advanced;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test14GroupingBy {

	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("lions", "tigers", "bears", "bird", "horse", "turtle", "cat", "cat", "cat");
		Stream<String> s2 = Stream.of("lions", "tigers", "bears", "bird", "horse", "turtle", "cat", "cat", "cat");
		Stream<String> s3 = Stream.of("lions", "tigers", "bears", "bird", "horse", "turtle", "cat", "cat", "cat");
		Stream<String> s4 = Stream.of("lions", "tigers", "bears", "bird", "horse", "turtle", "cat", "cat", "cat");
		Stream<String> s5 = Stream.of("lions", "tigers", "bears", "bird", "horse", "turtle", "cat", "cat", "cat");
		Stream<String> s6 = Stream.of("lions", "tigers", "bears", "bird", "horse", "turtle", "cat", "cat", "cat");
		Stream<String> s7 = Stream.of("lions", "tigers", "bears", "bird", "horse", "turtle", "cat", "cat", "cat");
		//
		Map<Integer, List<String>> groupedBy1 = s1.collect(Collectors.groupingBy(String::length));
		System.out.println(groupedBy1);
		//

		Map<Integer, Set<String>> groupedBy2 = s2.collect(Collectors.groupingBy(String::length, Collectors.toSet()));
		System.out.println(groupedBy2);

		TreeMap<Integer, Set<String>> groupedBy3 = s3
				.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
		System.out.println(groupedBy3);

		TreeMap<Integer, List<String>> groupedBy4 = s4
				.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
		System.out.println(groupedBy4);

		Map<Integer, Long> groupedBy5 = s5.collect(Collectors.groupingBy(String::length, Collectors.counting()));
		System.out.println(groupedBy5);

		Map<Integer, Optional<Character>> groupedBy6 = s6.collect(Collectors.groupingBy(String::length,
				Collectors.mapping(s -> s.charAt(0), Collectors.minBy(Comparator.naturalOrder()))));
		System.out.println(groupedBy6);

	}
}
