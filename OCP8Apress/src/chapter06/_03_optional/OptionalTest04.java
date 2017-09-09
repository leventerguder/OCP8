package chapter06._03_optional;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class OptionalTest04 {

	public static void main(String[] args) {
		OptionalDouble max = DoubleStream.of(24.5, 23.6, 27.9, 21.1, 23.5, 25.5, 28.3).max();
		max.ifPresent(System.out::println);
	}
}
