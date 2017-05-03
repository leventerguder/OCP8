package _51.stream;

import java.util.Arrays;

public class StreamFlatMap {

	public static void main(String[] args) {
		Integer[][] data = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		Arrays.stream(data).flatMap(r -> Arrays.stream(r)).forEach(s -> System.out.print(s + " "));
	}
}
