package ch04._05.primitives;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class PrimitiveTest02average {

	public static void main(String[] args) {
		IntStream is = IntStream.of(1, 2, 3, 4);
		OptionalDouble opt = is.average();
		System.out.println(opt.getAsDouble());
	}
}
