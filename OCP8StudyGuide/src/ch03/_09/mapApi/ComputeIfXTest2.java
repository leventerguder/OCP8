package ch03._09.mapApi;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ComputeIfXTest2 {

	public static void main(String[] args) {
		//
		Map<String, Integer> counts = new HashMap<>();
		counts.put("Jenny", 15);
		counts.put("Tom", null);
		//
		Function<String, Integer> mapper = (k) -> 1;
		//
		BiFunction<String, Integer, Integer> mapper2 = (k, v) -> k.length() + v;
		Integer jenny = counts.computeIfAbsent("Jenny", mapper);
		Integer tom= counts.computeIfAbsent("Tom", mapper);
		// counts.compute("Sam", mapper);

		// Integer jenny2 = counts.compute("Jenny", mapper2);

		System.out.println(counts);
		System.out.println(jenny);
		//System.out.println(jenny2);
		System.out.println(tom);
	}
}
