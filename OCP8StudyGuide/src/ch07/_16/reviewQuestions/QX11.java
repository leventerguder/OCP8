package ch07._16.reviewQuestions;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class QX11 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Object o1 = new Object();
		Object o2 = new Object();
		ExecutorService service = Executors.newFixedThreadPool(2);

		Future<?> f1 = service.submit(() -> {
			synchronized (o1) {
				synchronized (o2) {
					System.out.println("Tortoise");
				}

			}
		});

		Future<?> f2 = service.submit(() -> {
			synchronized (o2) {
				synchronized (o1) {
					System.out.println("Hare");
				}
			}
		});
		
		f1.get();
		f2.get();
		
		// A. If the code does output anything, the order cannot be determined.
		// F. The code may produce a deadlock at runtime.
	}
}
