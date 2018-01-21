package ch07._12.parallelReductions;

import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test07ParallelStreamToConcurrentMap {

	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("lions", "tigers", "bears").parallel();
		ConcurrentMap<Integer, String> map = stream1
				.collect(Collectors.toConcurrentMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2));
		
		System.out.println(map); // {5=lions,bears, 6=tigers}
		System.out.println(map.getClass()); // java.util.concurrent.ConcurrentHashMap
	}
}
