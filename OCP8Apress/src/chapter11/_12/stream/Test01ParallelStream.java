package chapter11._12.stream;

import java.util.Arrays;
import java.util.List;

public class Test01ParallelStream {

	public static void main(String[] args) {

		List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
		boolean isParallel = ints.parallelStream().filter(i -> (i % 2) == 0).isParallel();
		//
		System.out.println(isParallel);

		List<Integer> ints2 = Arrays.asList(1, 2, 3, 4, 5);
		boolean isParallel2 = ints2.parallelStream().filter(i -> (i % 2) == 0).sequential().isParallel();

		System.out.println(isParallel2);
	}
}
