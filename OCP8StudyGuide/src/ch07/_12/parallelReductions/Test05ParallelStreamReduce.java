package ch07._12.parallelReductions;

import java.util.Arrays;

public class Test05ParallelStreamReduce {

	public static void main(String[] args) {
		System.out.println(Arrays.asList("w", "o", "l", "f").parallelStream().reduce("X", String::concat));
	}
}
