package _51.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollect {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 5, 6);
		int sum = list.stream().collect(Collectors.summingInt(i -> i));
		System.out.println(sum);
	}
}
