package ch03._09.mapApi;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class ComputeIfXTest {

	public static void main(String[] args) {
		Map<String, Integer> counts = new HashMap<>();
		counts.put("Jenny", 1);
		counts.put("Tom", 30);
		//
		BiFunction<String, Integer, Integer> mapper = (k, v) -> v + 1;
		//
		Integer jenny = counts.computeIfPresent("Jenny", mapper); // 2
		Integer sam = counts.computeIfPresent("Sam", mapper); // null
		//

		BiFunction<Integer, Integer, Integer> mpp = (v1, v2) -> v1 - v2;

		Integer tom = counts.merge("Tom", 10, mpp);

		System.out.println(jenny);
		System.out.println(sam);
		System.out.println(tom);
		//

		System.out.println(counts);

	}
}
