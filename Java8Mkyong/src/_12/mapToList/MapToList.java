package _12.mapToList;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.HashMap;

public class MapToList {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(10, "apple");
		map.put(20, "orange");
		map.put(30, "banana");
		map.put(40, "watermelon");
		map.put(50, "dragonfruit");

		List<Integer> list = map.entrySet().stream().map(e -> e.getKey()).collect(Collectors.toList());
		List<String> list2 = map.entrySet().stream().map(e->e.getValue()).collect(Collectors.toList());
		
		list.forEach(System.out::println);
		list2.forEach(System.out::println);
	}
}
