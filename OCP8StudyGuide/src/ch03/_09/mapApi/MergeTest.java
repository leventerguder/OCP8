package ch03._09.mapApi;

import java.util.function.BiFunction;
import java.util.Map;
import java.util.HashMap;

//
public class MergeTest {

	public static void main(String[] args) {

		BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 + " new" : v2 + " new";
		//
		Map<String, String> favorites = new HashMap<>();
		//
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Tom", "Tram");
		favorites.put("Jack", null);
		//
		//

		// default V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)
		//
		String jenny = favorites.merge("Jenny", "Skyride", mapper);
		System.out.println(jenny);

		String tom = favorites.merge("Tom", "Skyride", mapper);
		System.out.println(tom);

		// The merge() method also has logic for what happens if nulls or
		// missing keys are involved.
		String jack = favorites.merge("Jack", "NotNull", mapper);
		System.out.println(jack);

		// Notice that the mapping function isn’t called. If it were, we’d have
		// a NullPointerException. The mapping function is used only when there
		// are two actual values to decide between.

		String noKey = favorites.merge("NoKey", "NotNull", mapper);
		System.out.println(noKey);

		System.out.println(favorites);
		// {NoKey=NotNull, Tom=Skyride, Jenny=Bus Tour, Jack=NotNull}
		// Bus Tour
		// Skyride
	}
}
