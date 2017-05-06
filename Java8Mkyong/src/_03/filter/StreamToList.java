package _03.filter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToList {

	public static void main(String[] args) {
		Stream<Integer> number = Stream.of(1, 2, 3, 4, 5, 6);

		List<Integer> result = number.filter(n -> n != 3).collect(Collectors.toList());
		result.forEach(System.out::println);
	}
}
