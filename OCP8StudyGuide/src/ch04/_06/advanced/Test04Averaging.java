package ch04._06.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//
public class Test04Averaging {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		Double d = list.stream().collect(Collectors.averagingDouble(x -> x));
		Double d2 = list.stream().collect(Collectors.averagingInt(x -> x));
		Double d3 = list.stream().collect(Collectors.averagingLong(x -> x));
		System.out.println(d);
		System.out.println(d2);
		System.out.println(d3);
	}
}
