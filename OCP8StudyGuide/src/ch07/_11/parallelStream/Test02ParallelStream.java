package ch07._11.parallelStream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test02ParallelStream {

	public static void main(String[] args) {

		Stream<Integer> parallelStream = Arrays.asList(1, 2, 3, 4, 5, 6).parallelStream();
		System.out.println(parallelStream.count());
	}
}
