package ch04._07.reviewQuestions;

import java.util.stream.DoubleStream;

public class Qx18 {

	public static void main(String[] args) {
		DoubleStream s = DoubleStream.of(1.2, 2.4);
		s.peek(System.out::println).filter(x -> x > 2).count();
		//	1.2
		//	2.4

	}
}
