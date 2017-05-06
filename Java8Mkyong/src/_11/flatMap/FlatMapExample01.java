package _11.flatMap;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample01 {

	public static void main(String[] args) {
		String[][] data = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "f" } };

		Stream<String[]> temp = Arrays.stream(data);

		Function<String[], Stream<String>> f1 = (String[] x) -> Arrays.stream(x);
		temp.flatMap(f1).collect(Collectors.toList()).forEach(System.out::println);
		;
	}
}
