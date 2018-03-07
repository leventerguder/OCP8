package ch07._03.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Test01Future {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService service = Executors.newSingleThreadExecutor();
		Future<?> future = service.submit(() -> {
			System.out.println("ExecutorService#submit");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		service.shutdown();

		boolean isDone = future.isDone();
		boolean isShutdown = service.isShutdown();
		boolean awaitTermination = service.awaitTermination(1, TimeUnit.SECONDS);
		boolean isTerminated = service.isTerminated();
		// check wheter task is finished!

		System.out.println("isDone : " + isDone);
		System.out.println("isShutdown : " + isShutdown);
		System.out.println("awaitTermination : " + awaitTermination);
		System.out.println("isTerminated : " + isTerminated);
	}
}

// shutdown means the executor service takes no more incoming tasks.
// awaitTermination is invoked after a shutdown request.

// You need to first shut down the service and then block and wait for threads
// to finish.

// If you want to see all threads finish running and insist on using
// awaiTermination, you need to set the timeout parameter to be big enough. So you could do:
//
// eService.shutdown();
// if (!eService.awaitTermination(60000, TimeUnit.SECONDS))
// 	System.err.println("Threads didn't finish in 60000 seconds!");
// }
// Alternatively, you could do:
//
// eService.shutdown();
// while (!eService.isTerminated()) {
//

// https://stackoverflow.com/questions/18425026/shutdown-and-awaittermination-which-first-call-have-any-difference
// }
// This way you are able to ensure all threads are finished running unless they
// are interrupted unexpectedly.
