package ch04._02.builtInFunctionalInterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		// V put(K key, V value);

		BiConsumer<String, Integer> b1 = map::put;
		BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
		//
		b1.accept("ten", 10);
		b2.accept("hundred", 100);
		
		System.out.println(map);

	}
}
