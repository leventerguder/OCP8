package _03.library;

import java.util.function.BinaryOperator;

public class OverloadedResolution {
	private interface IntegerBiFunction extends BinaryOperator<Integer> {
	}

	private static void overloadedMethod(BinaryOperator<Integer> lambda) {
		System.out.print("BinaryOperator");
	}

	private static void overloadedMethod(IntegerBiFunction lambda) {
		System.out.print("IntegerBinaryOperator");
	}
	
	public static void main(String[] args) {
		overloadedMethod((x, y) -> x + y);
	}
}

// Java will infer the type of your lambda to be the most specific functional interface.

// public interface BinaryOperator<T> extends BiFunction<T,T,T>