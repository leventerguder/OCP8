package ch20;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class QX35 {

	public static void main(String[] args) {
		ForkJoinPool pool = new ForkJoinPool();
		try {
			System.out.print(pool.invoke(new Fun(10)));
		} finally {
			pool.shutdown();
		}
		// The application compiles but does not use the fork/join framework
		// correctly.
	}
}

// The purpose of the fork/join framework is to use parallel processing to
// complete subtasks across  multiple threads concurrently.
// The application compiles but does not use the fork/join framework correctly.

class Fun extends RecursiveTask<Integer> {

	final int value;

	public Fun(int value) {
		this.value = value;
	}

	@Override
	protected Integer compute() {
		if (value < 1) {
			return 1;
		}
		final Fun f1 = new Fun(value - 1);
		final Fun f2 = new Fun(value - 2);
		return f1.compute() * f2.compute();
	}
}