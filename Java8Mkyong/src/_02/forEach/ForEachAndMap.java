package _02.forEach;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class ForEachAndMap {

	public static void main(String[] args) {

		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		// classic
		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("item : " + entry.getKey() + " value : " + entry.getValue());
		}

		//
		BiConsumer<String, Integer> bic = (s, i) -> System.out.println("key : " + s + " value: " + i);
		items.forEach(bic);
	}
}
