package _08.sortMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortByKeyExample {

	public static void main(String[] args) {
		Map<String, Integer> unsortMap = new HashMap<>();
		unsortMap.put("z", 10);
		unsortMap.put("b", 5);
		unsortMap.put("a", 6);
		unsortMap.put("c", 20);
		unsortMap.put("d", 1);
		unsortMap.put("e", 7);
		unsortMap.put("y", 8);
		unsortMap.put("n", 99);
		unsortMap.put("j", 50);
		unsortMap.put("m", 2);
		unsortMap.put("f", 9);

		System.out.println("Original...");
		System.out.println(unsortMap);

		Map<String, Integer> result = new LinkedHashMap<>();
		//
		unsortMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.forEach(x -> result.put(x.getKey(), x.getValue()));
		System.out.println(result);

	}
}
