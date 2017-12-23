package ch04._05.primitives;

import java.util.stream.DoubleStream;

public class PrimitiveTest03DoubleStream {

	public static void main(String[] args) {
		DoubleStream empty = DoubleStream.empty();
		//
		DoubleStream ds = DoubleStream.of(1.5, 2.4, 5.6);
		ds.forEach(System.out::println);
	}
}
