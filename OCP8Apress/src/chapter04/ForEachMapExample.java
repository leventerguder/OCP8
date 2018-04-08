package chapter04;

import java.util.HashMap;
import java.util.Map;

public class ForEachMapExample {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("key1", 10);
		map.put("key2", 20);
		map.put("key3", 30);
		map.put("key4", 40);
		map.put("key5", 50);
		//
		map.forEach((key, value) -> System.out.println("key  : " + key + " value : " + value));
	}
}
