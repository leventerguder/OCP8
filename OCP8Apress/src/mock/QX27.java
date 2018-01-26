package mock;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class QX27 {

	public static void main(String[] args) {
		List<Map<List<Integer>, List<String>>> list = new ArrayList<>(); // ADD_MAP
		Map<List<Integer>, List<String>> map = new HashMap<>();
		list.add(null); // ADD_NULL
		list.add(map);
		list.add(new HashMap<List<Integer>, List<String>>()); // ADD_HASHMAP
		list.forEach(e -> System.out.print(e + " ")); // ITERATE

		// null {} {}
	}
}
