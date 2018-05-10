package ch13;

import java.util.function.Supplier;

public class QX24 {

	public static void main(String[] args) {
		//
		Supplier<Double> s1 = () -> Math.random();
		Supplier<Double> s2 = Math::random;
	}
}
