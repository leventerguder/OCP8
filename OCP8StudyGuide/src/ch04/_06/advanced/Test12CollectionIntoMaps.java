package ch04._06.advanced;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test12CollectionIntoMaps {

	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("lions", "tigers", "bears");
		// Map<Integer, String> map =
		// s1.collect(Collectors.toMap(String::length, Function.identity()));

		// java.lang.IllegalStateException: Duplicate key lions
		// What’s wrong? Two of the animal names are the same length. We didn’t
		// tell Java what to do.
		// Should the collector choose the first one it encounters? The last one
		// it encounters? Concatenate the two? Since the collector has no idea
		// what to do, it “solves” the problem by throwing an exception and
		// making it our problem

		Map<Integer, String> map = s1
				.collect(Collectors.toMap(String::length, Function.identity(), (str, str2) -> str + "," + str2));
		
		System.out.println(map);
		// {5=lions,bears, 6=tigers}
	}
}
