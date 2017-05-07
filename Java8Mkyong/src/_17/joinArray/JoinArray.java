package _17.joinArray;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JoinArray {

	public static void main(String[] args) {
		String[] s1 = new String[] { "a", "b", "c" };
		String[] s2 = new String[] { "d", "e", "f" };
		String[] s3 = new String[] { "g", "h", "i" };

		//
		String[] result = Stream.of(s1, s2, s3).flatMap(Stream::of).toArray(String[]::new);
		System.out.println(Arrays.toString(result));

		//
		int[] int1 = new int[] { 1, 2, 3 };
		int[] int2 = new int[] { 4, 5, 6 };
		int[] int3 = new int[] { 7, 8, 9 };

		//
		int[] result2 = IntStream
				.concat(Arrays.stream(int1), IntStream.concat(Arrays.stream(int2), Arrays.stream(int3))).toArray();

		System.out.println(Arrays.toString(result2));

	}
}
