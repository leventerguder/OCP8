package ch04._07.reviewQuestions;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class Qx17 {

	public static void main(String[] args) {
		UnaryOperator<Integer> u = x -> x * x;
		Function<Integer, Integer> f = x -> x * x;
		IntUnaryOperator iu = x -> x * x;
	}
}
