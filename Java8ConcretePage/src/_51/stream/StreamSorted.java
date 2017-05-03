package _51.stream;

import java.util.Arrays;
import java.util.List;

public class StreamSorted {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 20, 80, 10, 100, 40, 2);
		numbers.stream().sorted().forEach(System.out::println);
	}
}
