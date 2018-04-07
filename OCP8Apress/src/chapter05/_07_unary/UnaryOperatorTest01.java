package chapter05._07_unary;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest01 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(-11, 22, 33, -44, 55);
		//
		Function<Integer, Integer> function1 = Math::abs;
		IntFunction<Integer> intFunction1 = Math::abs;
		UnaryOperator<Integer> intUnary = Math::abs;
		list.replaceAll(Math::abs);

		System.out.println(list);
	}
}

// default void replaceAll(UnaryOperator<E> operator) {


// UnaryOperator<T> extends Function<T,T>

// IntUnaryOperator    ---> int applyAsInt(int)
// LongUnaryOperator   ---> long applyAsLong(long)
// DoubleUnaryOperator ---> double applyAsDouble(double)