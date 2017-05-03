package _51.stream;

import java.util.Arrays;
import java.util.List;

public class StreamMap {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		list.stream().map(i -> i * i).forEach(s -> System.out.print(s + " "));
	}
}

// mapToInt
// mapToLong
// mapToDouble