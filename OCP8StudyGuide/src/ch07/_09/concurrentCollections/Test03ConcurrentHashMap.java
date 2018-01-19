package ch07._09.concurrentCollections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test03ConcurrentHashMap {

	public static void main(String[] args) {

		Map<String, Integer> map = new ConcurrentHashMap<>();
		map.put("zebra", 52);
		map.put("elephant", 10);
		System.out.println(map.get("elephant"));
	}
}
