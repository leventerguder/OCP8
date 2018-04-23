package ch04._06.advanced;

import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test15PartitioningBy {

	public static void main(String[] args) {
		//
		Stream<String> s1 = Stream.of("lions", "tigers", "bears", "bird", "horse", "turtle", "cat", "cat", "cat");
		Stream<String> s2 = Stream.of("lions", "tigers", "bears", "bird", "horse", "turtle", "cat", "cat", "cat");

		Predicate<String> pred = str -> str.length() <= 5;

		Map<Boolean, List<String>> partitioningBy1 = s1.collect(Collectors.partitioningBy(pred));
		System.out.println(partitioningBy1);
		//

		Map<Boolean, Set<String>> partitioningBy2 = s2.collect(Collectors.partitioningBy(pred, Collectors.toSet()));
		System.out.println(partitioningBy2);

		// Unlike groupingBy(), we cannot change the type of Map that gets returned
		// However, there are only two keys in the map, so does it really matter which Map type we use
	}
}
