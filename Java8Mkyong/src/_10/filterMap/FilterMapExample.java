package _10.filterMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterMapExample {

	public static void main(String[] args) {
		//
		Map<Integer, String> HOSTING = new HashMap<>();
		HOSTING.put(1, "linode.com");
		HOSTING.put(2, "heroku.com");
		HOSTING.put(3, "digitalocean.com");
		HOSTING.put(4, "aws.amazon.com");

		// Set<Map.Entry<K, V>> entrySet();

		List<Map.Entry<Integer, String>> t = HOSTING.entrySet().stream()
				.filter((Map.Entry<Integer, String> entry) -> "aws.amazon.com".equals(entry.getValue()))
				.collect(Collectors.toList());

		System.out.println(t);

		Predicate<Map.Entry<Integer, String>> p = e -> e.getValue().equals("aws.amazon.com");

		String result = HOSTING.entrySet().stream().filter(p).map(m -> m.getValue()).collect(Collectors.joining());
		System.out.println(result);
	}
}
