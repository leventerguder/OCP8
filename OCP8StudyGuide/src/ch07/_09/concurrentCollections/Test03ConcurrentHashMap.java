package ch07._09.concurrentCollections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test03ConcurrentHashMap {

	public static void main(String[] args) {

		Map<String, Integer> foodData = new ConcurrentHashMap<>();
		foodData.put("zebra", 52);
		foodData.put("elephant", 10);
		for (String key : foodData.keySet())
			foodData.remove(key);
	}
}

// // The purpose of the concurrent collection classes is to solve common memory
// consistency errors.

// The concurrent classes were created to help avoid common issues in which
// multiple threads are adding and removing objects from the same collections.