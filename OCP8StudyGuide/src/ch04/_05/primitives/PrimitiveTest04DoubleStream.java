package ch04._05.primitives;

import java.util.stream.DoubleStream;

public class PrimitiveTest04DoubleStream {

	public static void main(String[] args) {
		DoubleStream random = DoubleStream.generate(Math::random);
		DoubleStream fractions = DoubleStream.iterate(.5, d -> d / 2);
		//

		random.limit(3).forEach(System.out::println);
		fractions.limit(3).forEach(System.out::println);

	}
}
