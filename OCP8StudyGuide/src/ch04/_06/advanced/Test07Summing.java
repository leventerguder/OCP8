package ch04._06.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test07Summing {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

		Integer sum1 = list.stream().collect(Collectors.summingInt(x -> x));
		Double sum2 = list.stream().collect(Collectors.summingDouble(x -> x));
		Long sum3 = list.stream().collect(Collectors.summingLong(x -> x));

		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);

	}
}
