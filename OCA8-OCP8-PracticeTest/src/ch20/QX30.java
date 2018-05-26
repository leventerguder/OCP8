package ch20;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class QX30 {

	public static void main(String[] args) {
		ExecutorService service = null;

		try {
			service = Executors.newCachedThreadPool();
			new Boat().row(service);
		} finally {
			service.shutdown();
		}
	}
}

// When a CyclicBarrier goes over its limit, the barrier count is reset to zero.
// The application defines a CyclicBarrier with a barrier limit of 5 threads.
// The application then submits 12 tasks to a cached executor service.
// In this scenario, a cached thread executor will use between 5 and 12 threads,
// reusing existing threads as they become
// available.
class Boat {

	private void waitTillFinished(CyclicBarrier c) {
		try {
			c.await();
			System.out.print("1");
		} catch (Exception e) {
		}
	}

	public void row(ExecutorService service) {
		final CyclicBarrier cb = new CyclicBarrier(5);
		IntStream.iterate(1, i -> i + 1).limit(12).forEach(i -> service.submit(() -> waitTillFinished(cb)));
	}
}