package ch07._12.parallelReductions;

import java.util.Arrays;

public class Test04ParallelStreamReduce {

	public static void main(String[] args) {
		System.out.println(Arrays.asList(1,2,3,4,5,6)
				.parallelStream()
				.reduce(0,(a,b) -> (a-b))); // NOT AN ASSOCIATIVE ACCUMULATOR
	
		// It may output -21, 3, or some other value, as the accumulator 
		// function violates the associativity property.
		
	}
}
