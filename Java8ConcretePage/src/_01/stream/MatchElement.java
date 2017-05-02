package _01.stream;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.List;

public class MatchElement {

	public static void main(String[] args) {
		Predicate<Integer> p = number -> number % 2 == 0;

		List<Integer> list = Arrays.asList(3, 5, 6);

		boolean allMatch = list.stream().allMatch(p);
		boolean anyMatch = list.stream().anyMatch(p);
		boolean noneMatch = list.stream().noneMatch(p);
		
		System.out.println(allMatch);
		System.out.println(anyMatch);
		System.out.println(noneMatch);

	}

}
