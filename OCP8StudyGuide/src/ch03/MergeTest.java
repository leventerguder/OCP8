package ch03;

import java.util.function.BiFunction;
import java.util.Map;
import java.util.HashMap;

//
public class MergeTest {

	public static void main(String[] args) {
		BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
		//
		Map<String, String> favorites = new HashMap<>();
		//
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Tom", "Tram");
		//
		System.out.println(favorites);
		//
		String jenny = favorites.merge("Jenny", "Skyride", mapper);
		System.out.println(jenny);

		String tom = favorites.merge("Tom", "Skyride", mapper);
		System.out.println(tom);
	}
}
