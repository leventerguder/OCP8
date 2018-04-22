package ch03._10.reviewQuestions;

import java.util.Map;
import java.util.HashMap;

public class QX25 {

	public static void main(String[] args) {
		//
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, null);
		//
		map.merge(1, 3, (a, b) -> a + b);
		map.merge(3, 3, (a, b) -> a + b);
		//
		System.out.println(map);
		// {1=13, 2=20, 3=3}
	}
}
