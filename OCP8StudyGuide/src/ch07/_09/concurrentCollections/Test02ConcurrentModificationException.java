package ch07._09.concurrentCollections;

import java.util.HashMap;
import java.util.Map;

public class Test02ConcurrentModificationException {

	public static void main(String[] args) {

		Map<String, Object> foodData = new HashMap<String, Object>();
		foodData.put("penguin", 1);
		foodData.put("flamingo", 2);
		for (String key : foodData.keySet())
			foodData.remove(key);
		// java.util.ConcurrentModificationException

		// ConcurrentHashMap will prevent the code from throwing an exceptio
	}
}
