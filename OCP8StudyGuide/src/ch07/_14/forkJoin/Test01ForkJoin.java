package ch07._14.forkJoin;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class Test01ForkJoin {
	
	public static void main(String[] args) {
		
		Double[] weights = new Double[10];
		ForkJoinTask<?> task = new WeighAnimalRecursiveAction(weights, 0, weights.length);
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(task);
		//

		// Creating a ForkJoinTask and submitting it to a ForkJoinPool does not
		// guarantee it will be executed immediately.

		System.out.println();
		System.out.print("Weights: ");
		Arrays.asList(weights).stream().forEach(d -> System.out.print(d.intValue() + " "));
	}
}