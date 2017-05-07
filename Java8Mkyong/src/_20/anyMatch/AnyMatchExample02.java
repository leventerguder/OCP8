package _20.anyMatch;

import java.util.stream.IntStream;

public class AnyMatchExample02 {

	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		boolean result = IntStream.of(number).anyMatch(x -> x == 4);
	}
}
