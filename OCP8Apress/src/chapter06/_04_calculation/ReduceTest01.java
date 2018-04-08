package chapter06._04_calculation;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ReduceTest01 {

	public static void main(String[] args) {
		int sum = IntStream.of(10, 20, 30, 40).sum();
		System.out.println(sum);
		//
		OptionalInt sum2 = IntStream.of(10, 20, 30, 40).reduce((int a, int b) -> a + b);
		System.out.println(sum2);

		int sum3 = IntStream.of(10, 20, 30, 40).reduce(150, ((a, b) -> a + b));
		System.out.println(sum3);

		//
		int factorial = IntStream.rangeClosed(1, 5).reduce((x, y) -> x * y).getAsInt();
		System.out.println(factorial);
	}
}
