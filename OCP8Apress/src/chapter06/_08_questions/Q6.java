package chapter06._08_questions;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Q6 {

	public static void main(String[] args) {
		maxMarks(IntStream.of(52, 60, 99, 80, 76));
	}

	public static void maxMarks(IntStream marks) {
		OptionalInt max = marks.max();
		// if (max.ifPresent()) {
		// System.out.println(max.getAsInt());
		// }

		max.ifPresent(System.out::println);
	}

}
