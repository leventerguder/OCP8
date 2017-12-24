package ch04._07.reviewQuestions;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Q8 {

	public static void main(String[] args) {
		IntStream empty = IntStream.empty();
		OptionalDouble average = empty.average();
		//
		System.out.println(average); // OptionalDouble.empty

		//
		IntStream empty2 = IntStream.empty();
		OptionalInt findAny = empty2.findAny();

		System.out.println(findAny); // OptionalInt.empty
		
		IntStream empty3 = IntStream.empty();
		int sum = empty3.sum();
		
		System.out.println(sum);
	}
}
