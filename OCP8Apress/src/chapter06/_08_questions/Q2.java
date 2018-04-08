package chapter06._08_questions;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Q2 {

	public static void main(String[] args) {
		IntStream temperatures = IntStream.of(-5, -6, -7, -5, 2, -8, -9);
		IntPredicate positiveTemperature = temp -> temp > 0;

		if (temperatures.anyMatch(positiveTemperature)) {
			int temp = temperatures.filter(positiveTemperature).findAny().getAsInt();
			// java.lang.IllegalStateException:
			System.out.println(temp);
		}
	}
}

// A stream once used ! cannot be used againd.
// anyMatch is a terminal operation , hence once anyMatch is called the stream
// in temperatures is considered used or consumed.
// hence calling findAny terminal operation on temperatures results in the
// program throwing java.lang.IllegalStateException