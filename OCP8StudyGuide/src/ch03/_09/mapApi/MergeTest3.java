package ch03._09.mapApi;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MergeTest3 {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, null);

		BiFunction<Integer, Integer, Integer> mapper = (a, b) -> a + b;
		map.merge(1, 50, mapper);
		map.merge(3, 100, mapper); 
		//
		System.out.println(map);
	}
}
