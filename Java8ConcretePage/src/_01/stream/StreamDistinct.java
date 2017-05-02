package _01.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinct {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 4, 4, 5, 5, 6, 7);
		long distinct = list.stream().distinct().count();

		List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());

		System.out.println(distinct);
		System.out.println(distinctList);
	}

}
