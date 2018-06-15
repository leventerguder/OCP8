package ch13._08.reviewQuestions;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class QX18 {

	// The problem with this code is that none of the locks that are acquired are ever released.
	// Since the executor service is pooled, the requests could come in any order
	
	// Finished could be outputted before any of the threads have requested their first lock.
	
	// B. It prints Got Write Lock!
	// D. It hangs indefinitely at runtime.
	public static void main(String[] args) {

		ExecutorService service = null;

		try {
			ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
			service = Executors.newFixedThreadPool(20);
			service.submit(() -> {
				readWriteLock.writeLock().lock(); // m2
				System.out.println("Got Write Lock!");
			});

			for (int i = 0; i < 10; i++) {
				service.submit(() -> {
					readWriteLock.readLock().lock(); // m3
					System.out.println("Got Read Lock!");
				});
			}

		} finally {
			if (service != null)
				service.shutdown();
		}
		System.out.print("Finished");
	}
}
