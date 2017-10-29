package _02.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Example6 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		BinaryOperator<Integer> bo = (Integer i, Integer j) -> i + j;
		int sum = numbers.stream().reduce(0, bo);

		System.out.println(sum);

	}
}
