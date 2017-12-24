package ch04._07.reviewQuestions;

import java.util.stream.Stream;

public class Qx10 {

	public static void main(String[] args) {
		Stream.generate(() -> "1").limit(10).forEach(System.out::println);
	}
}
