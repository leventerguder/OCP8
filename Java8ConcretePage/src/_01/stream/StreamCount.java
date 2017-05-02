package _01.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamCount {

	public static void main(String[] args) {
		Predicate<Integer> p = (Integer num) -> num % 2 == 0;

		List<Integer> list = Arrays.asList(3, 4, 6, 7, 8);

		long count = list.stream().filter(p).count();

		System.out.println(count);
	}
}
