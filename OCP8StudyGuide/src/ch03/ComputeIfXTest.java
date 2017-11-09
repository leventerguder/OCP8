package ch03;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class ComputeIfXTest {

	public static void main(String[] args) {
		Map<String, Integer> counts = new HashMap<>();
		counts.put("Jenny", 1);
		//
		BiFunction<String, Integer, Integer> mapper = (k, v) -> v + 1;
		//
		Integer jenny = counts.computeIfPresent("Jenny", mapper); // 2
		Integer sam = counts.computeIfPresent("Sam", mapper); // null
		//

	}
}
