package chapter04.questions;

import java.util.stream.DoubleStream;

public class Q6 {

	public static void main(String[] args) {
		DoubleStream nums = DoubleStream.of(1.0, 2.0, 3.0).map(i -> -i); // #1
		System.out.printf("count = %d, sum = %f", nums.count(), nums.sum());
		// This program crashes by throwing a java.lang.IllegalStateException
		// java.lang.IllegalStateException: stream has already been operated
		// upon or closed
	}
}
