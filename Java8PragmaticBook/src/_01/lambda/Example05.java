package _01.lambda;

import java.util.HashMap;
import java.util.Map;

public class Example05 {

	public static void main(String[] args) {

		// compile error in JDK7
		useHashMap(new HashMap<>());
		// Java8 type inference has been improved.

		//the generic types to HashMap can be inferred from the type of diamondWordCounts 
		Map<String, Integer> oldWordCounts = new HashMap<String, Integer>();
		Map<String, Integer> diamondWordCounts = new HashMap<>();
		//
		System.out.println(oldWordCounts);
		System.out.println(diamondWordCounts);
	}

	public static void useHashMap(Map<String, String> values) {
	}
}
