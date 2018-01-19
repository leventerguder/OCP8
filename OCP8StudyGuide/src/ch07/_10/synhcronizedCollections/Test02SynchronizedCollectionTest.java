package ch07._10.synhcronizedCollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Test02SynchronizedCollectionTest {

	// Unlike the concurrent collections, the synchronized collections also
	// throw an exception if they are modi ed within an iterator by a single
	// thread.

	public static void main(String[] args) {
		Map<String, Object> foodData = new HashMap<String, Object>();
		foodData.put("penguin", 1);
		foodData.put("flamingo", 2);
		//
		Map<String, Object> synchronizedFoodData = Collections.synchronizedMap(foodData);
		for (String key : synchronizedFoodData.keySet())
			synchronizedFoodData.remove(key);
	}
}
