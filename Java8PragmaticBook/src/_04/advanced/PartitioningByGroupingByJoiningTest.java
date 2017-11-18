package _04.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitioningByGroupingByJoiningTest {

	public static void main(String[] args) {
		//
		List<Integer> numbers = Arrays.asList(1, 2, 5, 4, 1, 1, -10, 20);
		Map<Boolean, List<Integer>> mapWithPartitioningBy = numbers.stream()
				.collect(Collectors.partitioningBy(i -> i % 2 == 0));

		System.out.println(mapWithPartitioningBy);

		//
		Map<Integer, List<Integer>> map = numbers.stream().collect(Collectors.groupingBy(i -> i * 2));
		System.out.println(map);

		Stream<String> str = Stream.of("in", "java", "we", "trust");
		String stringJoined = str.collect(Collectors.joining());
		System.out.println(stringJoined);
		//

		Stream<String> str2 = Stream.of("in", "java", "we", "trust");
		String stringJoined2 = str2.collect(Collectors.joining("#"));
		System.out.println(stringJoined2);
	}
}
