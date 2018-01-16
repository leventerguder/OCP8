package ch07._02.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test01ExecutorService {

	public static void main(String[] args) {

		ExecutorService service = Executors.newSingleThreadExecutor();

		System.out.println("begin");

		service.execute(() -> {
			System.out.println("sample runnable");
			System.out.println("thread execute 1: " + Thread.currentThread().getName());
		});

		service.execute(() -> {
			for (int i = 0; i < 3; i++)
				System.out.println("Printing record: " + i);

			System.out.println("thread execute 2: " + Thread.currentThread().getName());
		});

		// single-thread executor, results are guaranteed to be executed in the
		// order in which they are added to the executor service
		// This is because the main() method is still an independent thread from
		// the ExecutorService, and it can perform tasks while the other thread
		// is running

		System.out.println("end");

		System.out.println(service.isShutdown());
		System.out.println(service.isTerminated());
		service.shutdown();
		// A thread executor creates a non-daemon thread on the rst task that is
		// executed, so failing to call shutdown() will result in your
		// application never terminating.
		
		//		service.execute(() -> {
		//			System.out.println("java.util.concurrent.RejectedExecutionException");
		//		});
	}
}
