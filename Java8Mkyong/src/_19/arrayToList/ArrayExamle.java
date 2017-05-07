package _19.arrayToList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayExamle {

	public static void main(String[] args) {
		//
		Integer[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		List<Integer> list = Arrays.stream(number).collect(Collectors.toList());
		list.forEach(System.out::println);

		System.out.println();

		int[] number2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		Arrays.stream(number2).boxed().collect(Collectors.toList());

		List<Integer> asList = Arrays.asList(number);
		List<int[]> asList2 = Arrays.asList(number2);

		asList.forEach(System.out::println);
		System.out.println();

		asList2.forEach(System.out::println);
	}
}
