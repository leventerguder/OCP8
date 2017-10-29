package _01.lambda;

import java.util.HashMap;
import java.util.Map;

public class Example05 {

	public static void main(String[] args) {
		
		//compile error in JDK7
		useHashMap(new HashMap<>());
		//Java8 type inference has been improved.
	}

	public static void useHashMap(Map<String, String> values) {
	}
}
