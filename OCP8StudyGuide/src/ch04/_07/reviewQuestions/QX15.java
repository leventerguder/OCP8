package ch04._07.reviewQuestions;

import java.util.Map;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QX15 {

	public static void main(String[] args) {
		//
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
		Predicate<Integer> p1 = i -> i % 2 == 0;

		Map<Boolean, List<Integer>> map = stream.collect(Collectors.partitioningBy(p1));
		System.out.println(map);
	}
}

// The partitioningBy() collector creates a Map<Boolean, List<String>> when
// passed to collect() by default.
// D. Map<Boolean, List<String>>
// E. Map<Boolean, Set<String>>