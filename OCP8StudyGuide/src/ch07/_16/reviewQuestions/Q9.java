package ch07._16.reviewQuestions;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Q9 extends MyTask {
	private Integer[] elements;
	private int a;
	private int b;

	public Q9(Integer[] elements, int a, int b) {
		this.elements = elements;
		this.a = a;
		this.b = b;
	}

	public Integer compute() {
		if ((b - a) < 2)
			return Math.min(elements[a], elements[b]);
		else {
			int m = a + ((b - a) / 2);
			System.out.println(a + "," + m + "," + b);
			MyTask t1 = new Q9(elements, a, m);
			int result = t1.fork().join();
			return Math.min(new Q9(elements, m, b).compute(), result);
		}
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Integer[] elements = new Integer[] { 8, -3, 2, -54 };
		MyTask task = new Q9(elements, 0, elements.length - 1);
		ForkJoinPool pool = new ForkJoinPool(1);
		Integer sum = pool.invoke(task);
		System.out.println("Min: " + sum);
	}
}

abstract class MyTask extends RecursiveTask<Integer> {
}