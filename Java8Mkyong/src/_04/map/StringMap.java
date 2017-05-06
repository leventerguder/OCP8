package _04.map;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Arrays;

public class StringMap {

	public static void main(String[] args) {
		List<String> alpha = Arrays.asList("a", "b", "c", "d");

		//
		Function<String, String> f1 = (String s1) -> s1.toUpperCase();

		List<String> uppers = alpha.stream().map(f1).collect(Collectors.toList());
		uppers.forEach(e -> System.out.print(e + " "));

		//
		System.out.println();

		Function<Integer, Integer> f2 = (Integer i1) -> i1 * 2;
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		numbers.stream().map(f2).collect(Collectors.toList()).forEach(i -> System.out.print(i + " "));
	}
}
