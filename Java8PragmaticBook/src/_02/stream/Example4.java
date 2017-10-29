package _02.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example4 {
	public static void main(String[] args) {
		List<Integer> together = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4)).flatMap(n -> n.stream())
				.collect(Collectors.toList());
		
		System.out.println(together);
	}
}
