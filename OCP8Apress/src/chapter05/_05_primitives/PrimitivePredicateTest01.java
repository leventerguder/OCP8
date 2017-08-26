package chapter05._05_primitives;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PrimitivePredicateTest01 {

	public static void main(String[] args) {

		// The built-in interfaces Predicate, Consumer, Function, and Supplier
		// operate on reference type objects. For primitive types there are
		// specializations available for int, long and double types for these
		// functional interfaces.

		// However, performance can suffer when we use wrapper types: think of
		// boxing and unboxing a few million integers in a stream. To avoid this
		// performance problem, you can instead use relevant primitive versions
		// of these functional interfaces.

		IntPredicate ip = (int i) -> i %2 ==0;
		IntStream.range(1, 10).filter(ip).forEach(System.out::println);
	}
}
