package ch07._14.forkJoin;

import java.util.Random;
import java.util.concurrent.RecursiveAction;

public class WeighAnimalRecursiveAction extends RecursiveAction {

	private int start;
	private int end;
	private Double[] weights;

	public WeighAnimalRecursiveAction(Double[] weights, int start, int end) {
		super();
		this.weights = weights;
		this.start = start;
		this.end = end;
	}

	@Override
	protected void compute() {

		if (end - start <= 3)
			for (int i = start; i < end; i++) {
				weights[i] = (double) new Random().nextInt(100);
				System.out.println("Animal Weighed: " + i);
			}
		else {
			int middle = start + ((end - start) / 2);
			System.out.println("[start=" + start + ",middle=" + middle + ",end=" + end + "]");

			invokeAll(new WeighAnimalRecursiveAction(weights, start, middle), new WeighAnimalRecursiveAction(weights, middle, end));
		}

	}

}
