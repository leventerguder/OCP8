package ch07._13.cyclicBarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test02CyclicBarrier {

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(4);

		LionPenManagerCyclic manager = new LionPenManagerCyclic();
		//
		CyclicBarrier c1 = new CyclicBarrier(4);
		CyclicBarrier c2 = new CyclicBarrier(4, () -> System.out.println("*** Pen cleaned!"));

		Runnable task = () -> manager.performTask(c1, c2);
		for (int i = 0; i < 4; i++) {
			service.submit(task);
		}
		
		service.shutdown();
	}
}
