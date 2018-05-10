package ch14;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class QX11 {

	public static void main(String[] args) {

		BiFunction<Double, Double, Double> biFunction = (d1, d2) -> d1 + d2;
		BinaryOperator<Double> binaryOperator = (d1, d2) -> d1 + d2;
	}
}
