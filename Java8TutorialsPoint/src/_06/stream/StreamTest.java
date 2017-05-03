package _06.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

//Stream 

// sequence of elements 
// a stream provides a set of elements of specific type in a sequential manner.

// source
// Stream takes Collections Arrays or I/O resources

// Aggregate operations
// filter map limit reduce find mactch..

//pipelining
public class StreamTest {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

		long count = strings.stream().filter(str -> str.isEmpty()).count();
		System.out.println(count);

		count = strings.stream().filter(str -> str.length() == 3).count();
		System.out.println(count);

		strings.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList()).forEach(System.out::println);
		String joined = strings.stream().filter(str -> !str.isEmpty()).collect(Collectors.joining(", "));
		System.out.println(joined);

		//

		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList()).forEach(System.out::println);

		//
		IntSummaryStatistics stats = numbers.stream().mapToInt(x -> x).summaryStatistics();
		System.out.println(stats.getMax());
		System.out.println(stats.getMin());
		System.out.println(stats.getAverage());
		System.out.println(stats.getCount());
		System.out.println(stats.getSum());

		//

		Random random = new Random();
		random.ints().limit(10).sorted().forEach(System.out::println);
	}
}
