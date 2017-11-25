package ch03._09.mapApi;

import java.util.HashMap;
import java.util.Map;

public class PutIfAbsentTest {

	public static void main(String[] args) {
		//
		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour");
		favorites.putIfAbsent("Tom", null);

		favorites.putIfAbsent("Jenny", "Tram");
		favorites.putIfAbsent("Sam", "Tram");
		favorites.putIfAbsent("Tom", "Tram");
		//
		System.out.println(favorites);

		// {Tom=Tram, Jenny=Bus Tour, Sam=Tram}

		// As you can see, Jenny’s value is not updated because one was already
		// present. Sam wasn’t there at all, so he was added. Tom was present as
		// a key but had a null value. Therefore, he was added as well
	}
}
