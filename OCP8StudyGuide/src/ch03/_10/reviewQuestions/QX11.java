package ch03._10.reviewQuestions;

import java.util.Map;
import java.util.HashMap;

public class QX11 {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>(10);
		for (int i = 1; i <= 10; i++) {
			map.put(i, i * i);
		}
		System.out.println(map.get(4));
	}
}
