package ch04._05.primitives;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class PrimitiveTest07Optional {

	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1, 10);
		OptionalDouble optional = stream.average();
		System.out.println(optional.getAsDouble());
	}
}
