package ch23;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class QX26 {

	private static void await(CyclicBarrier b) {
		try {
			b.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		ExecutorService s = Executors.newFixedThreadPool(4);
		final CyclicBarrier b = new CyclicBarrier(4, () -> System.out.println("Jump!"));

		IntStream.iterate(1, q -> 2).limit(10).forEach(q -> s.execute(() -> await(b)));
		s.shutdown();
		
		// Jump! is printed twice , The program hangs
		// F. None of the above
	}
	// ExecutorService has up to four threads active , which is the same number of threads required to reach the CyclicBarrier limit.
	// Therefore, the barrier limit is reached twice.
}
