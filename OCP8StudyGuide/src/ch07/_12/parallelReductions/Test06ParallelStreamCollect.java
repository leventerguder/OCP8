package ch07._12.parallelReductions;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test06ParallelStreamCollect {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();
		Set<String> set = stream.collect(Collectors.toSet());
		System.out.println(set);

		//[f, w, l, o]
	}
}
