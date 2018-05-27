package ch22;

import java.util.Map;
import java.util.TreeMap;

public class QX37 {

	public static void main(String[] args) {

		Map<String, String> map = new TreeMap<>();
		map.put("tool", "hammer");
		map.put("problem", "nail");
		
		// Property props = new Property(); //p1 
		//compile error
		// B. The code does not compile due to line p1.
	}
}
