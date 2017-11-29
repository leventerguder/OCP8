package ch03._09.mapApi;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MergeTest2 {

	public static void main(String[] args) {
		//
		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Tom", "Bus Tour");
		//
		BiFunction<String, String, String> mapper = (v1, v2) -> null;

		// Jenny was removed because the mapping function returned null.

		favorites.merge("Jenny", "Skyride", mapper);
		favorites.merge("Sam", "Skyride", mapper);

		System.out.println(favorites);
	}
}
