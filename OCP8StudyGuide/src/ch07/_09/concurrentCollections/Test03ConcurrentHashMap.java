package ch07._09.concurrentCollections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test03ConcurrentHashMap {

	public static void main(String[] args) {

		Map<String, Integer> foodData = new ConcurrentHashMap<>();
		foodData.put("zebra", 52);
		foodData.put("elephant", 10);
		// foodData.put("exception", null); //java.lang.NullPointerException
		// ConcurrentHashMap doesn't allow null keys and null values
		for (String key : foodData.keySet())
			foodData.remove(key);
	}
}

// // The purpose of the concurrent collection classes is to solve common memory
// consistency errors.

// The concurrent classes were created to help avoid common issues in which
// multiple threads are adding and removing objects from the same collections.

// You should use a concurrent collection class anytime that you are going to
// have multiple threads modify a collections object outside a synchronized
// block or method, even if you don expect a concurrency problem