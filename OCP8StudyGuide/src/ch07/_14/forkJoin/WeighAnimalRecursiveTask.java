package ch07._14.forkJoin;

import java.util.Random;
import java.util.concurrent.RecursiveTask;

public class WeighAnimalRecursiveTask extends RecursiveTask<Double> {
	private int start;
	private int end;
	private Double[] weights;

	public WeighAnimalRecursiveTask(Double[] weights, int start, int end) {
		this.start = start;
		this.end = end;
		this.weights = weights;
	}

	@Override
	protected Double compute() {
		if (end - start <= 3) {
			double sum = 0;
			for (int i = start; i < end; i++) {
				weights[i] = (double) new Random().nextInt(100);
				System.out.println("Animal Weighed: " + i);
				sum += weights[i];
			}
			return sum;
		} else {
			int middle = start + ((end - start) / 2);
			System.out.println("[start=" + start + ",middle=" + middle + ",end=" + end + "]");
			RecursiveTask<Double> otherTask = new WeighAnimalRecursiveTask(weights, start, middle);
			otherTask.fork();
			return new WeighAnimalRecursiveTask(weights, middle, end).compute() + otherTask.join();
		}
		// Since the invokeAll() method doesn’t return a value, we instead issue
		// a fork() and join() command to retrieve the recursive data

		// The fork() method instructs the fork/join framework to complete the
		// task in a separate thread, while the join() method causes the current
		// thread to wait for the results.
	}
}
