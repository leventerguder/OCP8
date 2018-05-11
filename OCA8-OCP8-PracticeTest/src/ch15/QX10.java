package ch15;

import java.util.Map;
import java.util.HashMap;

public class QX10 {

	public static void main(String[] args) {
		//
		Map<Integer, Integer> map = new HashMap<>();
		map.put(9, 3);

		// Map<Integer, Integer> result = map.stream().map((k,v) -> (v,k)); // compile error
		// System.out.println(result.keySet().iterator().next());
	}
}
