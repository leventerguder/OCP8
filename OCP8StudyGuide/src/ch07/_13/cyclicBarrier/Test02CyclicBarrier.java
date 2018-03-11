package ch07._13.cyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test02CyclicBarrier {

	public static void main(String[] args) {

		// If you are using a thread pool, make sure that you set the number of
		// available threads to be at least as large as your CyclicBarrier limit
		// value.
		ExecutorService service = Executors.newFixedThreadPool(4);

		LionPenManagerCyclic manager = new LionPenManagerCyclic();
		//
		// The CyclicBarrier class allows us to perform complex, multi threaded
		// tasks, while all threads stop and wait at logical barriers.
		CyclicBarrier c1 = new CyclicBarrier(4);

		Runnable task = () -> manager.performTask(c1);
		for (int i = 0; i < 4; i++) {
			service.submit(task);
		}

		service.shutdown();
	}
}

class LionPenManagerCyclic {

	private void removeAnimals() {
		System.out.println("Removing animals ," + Thread.currentThread().getName());
	}

	private void cleanPen() {
		System.out.println("Cleaning the pen , " + Thread.currentThread().getName());
	}

	private void addAnimals() {
		System.out.println("Adding animals , " + Thread.currentThread().getName());
	}

	public void performTask(CyclicBarrier c1) {
		try {
			removeAnimals();
			c1.await();
			cleanPen();
			c1.await();
			addAnimals();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}

	}

}
