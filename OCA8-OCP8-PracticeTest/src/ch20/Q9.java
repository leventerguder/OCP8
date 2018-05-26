package ch20;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q9 {

	public static void main(String[] args) {
		
		new CartoonCat().march(new CyclicBarrier(4, () -> System.out.print("Ready")));

		// How many times does the following application print Ready at runtime?
		// A. Zero
		
		// The application defines a thread executor with a single thread and 12 submitted tasks.
		// CyclicBarrier requires four threads to release it, the application waits endlessly in a frozen condition.
	}
}

class CartoonCat {

	private void await(CyclicBarrier c) {

		try {
			c.await();
		} catch (Exception e) {
		}
	}

	public void march(CyclicBarrier c) {

		ExecutorService s = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 12; i++)
			s.execute(() -> await(c));
		s.shutdown();
	}

}
// public int await() throws InterruptedException, BrokenBarrierException {
