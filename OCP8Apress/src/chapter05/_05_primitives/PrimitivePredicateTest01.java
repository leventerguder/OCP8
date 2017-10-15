package chapter05._05_primitives;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PrimitivePredicateTest01 {

	public static void main(String[] args) {
		IntPredicate ip = i -> i % 2 == 0;
		IntStream.range(1, 10).filter(ip).forEach(System.out::println);
	}
}
