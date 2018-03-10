package ch07._11.parallelStream;

import java.util.Arrays;

public class Test05ParallelStream {

	public static void main(String[] args) {

		Arrays.asList("jackal", "kangaroo", "lemur").parallelStream().map(s -> {
			System.out.println(s);
			return s.toUpperCase();
		}).forEach(System.out::println);
	}
}

// For the exam, you should remember that parallel streams can process results
// independently, although the order of the results cannot be determined ahead
// of time.