package chapter04.questions;

import java.util.stream.IntStream;

public class Q5 {

	public static void main(String[] args) {
		IntStream.rangeClosed(1, 1).forEach(System.out::println);
		//
		IntStream.range(1, 1).forEach(System.out::println); // no output
	}
}
