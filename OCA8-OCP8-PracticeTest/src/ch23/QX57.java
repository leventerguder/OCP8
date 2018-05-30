package ch23;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

// The code compiles but does not implement the fork/join framework in a proper multi- threaded manner.
public class QX57 {

	public static void main(String[] args) {
		
		ForkJoinPool pool = new ForkJoinPool();
		ForkJoinTask<?> task = new PassButter(10);
		System.out.print(pool.invoke(task));
		pool.shutdown();
	}
}

class PassButter extends RecursiveTask<String> {

	final int remainder;

	public PassButter(int remainder) { // j2
		this.remainder = remainder;
	}

	@Override
	protected String compute() {
		if (remainder <= 1)
			return "1";
		else {
			PassButter otherTask = new PassButter(remainder - 1);
			String otherValue = otherTask.fork().join(); // j3
			return otherValue + new PassButter(remainder - 2).compute();
		}
	}

}