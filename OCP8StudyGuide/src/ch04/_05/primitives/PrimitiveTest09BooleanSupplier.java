package ch04._05.primitives;

import java.util.function.BooleanSupplier;

public class PrimitiveTest09BooleanSupplier {

	public static void main(String[] args) {
		BooleanSupplier bs1 = () -> true;
		BooleanSupplier bs2 = () -> Math.random() > 0.2;

		System.out.println(bs1.getAsBoolean());
		System.out.println(bs2.getAsBoolean());
	}
}
