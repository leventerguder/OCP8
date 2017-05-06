package _03.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterExample {

	public static void main(String[] args) {
		List<String> lines = Arrays.asList("spring", "node", "mkyong");

		Predicate<String> pred = (String str) -> !"node".equals(str);

		List<String> result = lines.stream().filter(pred).collect(Collectors.toList());
		result.forEach(System.out::println);
		
		
	}
}
