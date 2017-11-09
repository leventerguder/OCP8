package ch03;

import java.util.HashMap;
import java.util.Map;

public class PutIfAbsentTest {

	public static void main(String[] args) {
		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour");

		favorites.putIfAbsent("Jenny", "Tram");
		favorites.putIfAbsent("Sam", "Tram");
		favorites.putIfAbsent("Tom", "Tram");
		//
		System.out.println(favorites);
	}
}
