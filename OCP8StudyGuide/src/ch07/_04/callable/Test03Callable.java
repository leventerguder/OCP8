package ch07._04.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Test03Callable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService service = Executors.newSingleThreadExecutor();

		Future<Integer> f1 = service.submit(() -> {
			int sum = 0;
			for (int i = 0; i < 100; i++) {
				sum = sum + i;
			}
			return sum;
		});

		Future<Integer> f2 = service.submit(() -> {
			int sum = 0;
			for (int i = 100; i < 1000; i++) {
				sum = sum + i;
			}
			return sum;
		});

		if (service != null) {
			service.shutdown();
		}

		if (service != null) {
			service.awaitTermination(1, TimeUnit.MILLISECONDS);

			if (service.isTerminated()) {
				System.out.println("All tasks finished");
			} else {
				System.out.println("not all finished yet!");
			}
		}

		System.out.println(f1.get());
		System.out.println(f2.get());
	}
}
