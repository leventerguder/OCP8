package ch03;

import java.util.HashMap;
import java.util.Map;

public class ComputeIfXTest3 {

	public static void main(String[] args) {

		Map<String, Integer> counts = new HashMap<>();
		counts.put("Jenny", 1);
		//
		counts.computeIfPresent("Jenny", (String k, Integer v) -> null); // computeIfPresent
																			// ,BiFunction
		// If the mapping function is called and returns null, the key is
		// removed from the map for computeIfPresent()

		System.out.println(counts);

		counts.computeIfAbsent("Sam", (String key) -> null); // computeIfAbsent
																// , Function

		// The call to computeIfPresent() removes the key from the map. The call
		// to computeIfAbsent() doesn’t add a key.
	}

}
