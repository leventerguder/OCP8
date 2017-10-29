package _09.collectors.join;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("levent", "mehmet", "ali", "mahmut");
		
		String joined=names.stream().map(str -> str).collect(Collectors.joining(", ", "[", "]"));
		
		System.out.println(joined);
	}
}
