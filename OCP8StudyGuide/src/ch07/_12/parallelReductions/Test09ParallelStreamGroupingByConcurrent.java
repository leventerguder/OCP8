package ch07._12.parallelReductions;

import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test09ParallelStreamGroupingByConcurrent {

	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("lions", "tigers", "bears").parallel();
		ConcurrentMap<Integer, List<String>> map = stream1.collect(Collectors.groupingByConcurrent(String::length));
		System.out.println(map); // {5=[lions, bears], 6=[tigers]}
	}
}