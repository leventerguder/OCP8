package ch07._09.concurrentCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test02ConcurrentModificationException {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		names.add("name1");
		names.add("name2");
		names.add("name3");
		//
		// for (String e : names) {
		// names.remove(e);
		// java.util.ConcurrentModificationException
		// }

		Map<String, Object> foodData = new HashMap<String, Object>();
		foodData.put("penguin", 1);
		foodData.put("flamingo", 2);
		for (String key : foodData.keySet())
			foodData.remove(key);
		// java.util.ConcurrentModificationException

		// ConcurrentHashMap will prevent the code from throwing an exceptio
	}
}
