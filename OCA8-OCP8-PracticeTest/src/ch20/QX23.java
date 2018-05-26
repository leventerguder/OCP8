package ch20;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class QX23 {

	public static void main(String[] args) {

		ForkJoinPool pool = new ForkJoinPool();
		CountSheep action = new CountSheep(0, CountSheep.sheep.length);
		pool.invoke(action);
		pool.shutdown();
		System.out.print(action.count);
	}
}

class CountSheep extends RecursiveAction {

	static int[] sheep = new int[] { 1, 2, 3, 4 };
	final int start;
	final int end;
	int count = 0;

	// The count value is not marked static and not shared by all of the
	// CountSheep subtasks.
	// The value of count printed in the main() menu comes from the first
	// CountSheep instance, which does not
	// modify the count variable.
	public CountSheep(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	@Override
	protected void compute() {

		if (end - start < 2) {
			count += sheep[start];
			return;
		} else {
			int middle = start + (end - start) / 2;
			invokeAll(new CountSheep(start, middle), new CountSheep(middle, end));
		}
	}

}