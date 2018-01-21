package ch07._12.parallelReductions;

import java.util.Arrays;

public class Test02ParallelStreamUnordered {

	public static void main(String[] args) {

		Arrays.asList(1, 5, 20, 4, 3, 8, 100).stream().unordered().parallel().forEach(System.out::println);
		// For serial streams, using an unordered version has no effect, but on
		// parallel streams, the results can greatly improve performance:
		// you should know when to apply an unordered stream to improve
		// performance.
	}
}
