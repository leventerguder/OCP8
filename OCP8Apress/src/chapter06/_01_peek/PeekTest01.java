package chapter06._01_peek;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class PeekTest01 {

	public static void main(String[] args) {
		long count = Stream.of(1, 2, 3, 4, 5).map(i -> i * i).count();
		System.out.println(count);

		long count2 = Stream.of(1, 2, 3, 4, 5).map(i -> i * i).peek(i -> System.out.printf("%d ", i)).count();

		System.out.println(count2);

		System.out.println();
		double sum = DoubleStream.of(1.0, 4.0, 9.0).map(Math::sqrt).peek(System.out::println).sum();
		System.out.println(sum);
	}
}
