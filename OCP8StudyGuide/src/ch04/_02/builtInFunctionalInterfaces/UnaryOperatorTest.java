package ch04._02.builtInFunctionalInterfaces;

import java.util.function.UnaryOperator;
import java.util.function.Function;

public class UnaryOperatorTest {

	public static void main(String[] args) {

		// UnaryOperator and BinaryOperator are special case of a function.
		// public String toUpperCase()
		// interface UnaryOperator<T> extends Function<T, T>
		UnaryOperator<String> u1 = String::toUpperCase;
		UnaryOperator<String> u2 = x -> x.toUpperCase();
		Function<String, String> f1 = String::toUpperCase;

		System.out.println(u1.apply("test"));
		System.out.println(u2.apply("test"));
		System.out.println(f1.apply("test"));
	}
}
