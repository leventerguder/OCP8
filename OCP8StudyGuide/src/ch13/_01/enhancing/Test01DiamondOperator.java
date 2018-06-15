package ch13._01.enhancing;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Test01DiamondOperator {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		
		// the diamond operator <>, is allowed only on the right side!
		// List<> list1 2= new ArrayList<String>(); // DOES NOT COMPILE

		Map<Map<String, Integer>, List<Double>> map1 = new HashMap<Map<String, Integer>, List<Double>>();
		Map<Map<String, Integer>, List<Double>> map2 = new HashMap<>();
		// Map<Map<String,Integer>,List<Double>> map3= new HashMap<<>,<>>();  // DOES NOT COMPILE
		// Nesting diamond operators is not allowed.
		
		//
	}
}
