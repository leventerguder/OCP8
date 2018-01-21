package ch07._14.forkJoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class Test02ForkJoin {

	public static void main(String[] args) {

		Double[] weights = new Double[10];
		ForkJoinTask<Double> task = new WeighAnimalRecursiveTask(weights, 0, weights.length);
		ForkJoinPool pool = new ForkJoinPool();
		Double sum = pool.invoke(task);
		System.out.println("Sum: " + sum);
	}
}
