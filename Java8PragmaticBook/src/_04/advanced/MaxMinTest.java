package _04.advanced;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxMinTest {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 5, 4, 1, 1, -10, 20);
		Optional<Integer> max = numbers.stream().collect(Collectors.maxBy(Comparator.comparing(i -> i)));
		Optional<Integer> min = numbers.stream().collect(Collectors.minBy(Comparator.comparing(Function.identity())));

		Double average = numbers.stream().collect(Collectors.averagingInt(i -> i));

		System.out.println(min);
		System.out.println(max);
		System.out.println(average);
	}
}
