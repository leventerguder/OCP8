package ch07._03.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Test02Future {

	private static int counter;

	public static void main(String[] args) {
		ExecutorService service = null;

		service = Executors.newSingleThreadExecutor();
		Future<?> result = service.submit(() -> {
			for (int i = 0; i < 50000; i++) {
				counter++;
			}
		});

		try {
			// waits at most 10 second , throw TimeOutException if the task is
			// not done!
			Object obj = result.get(10, TimeUnit.SECONDS);
			System.out.println("After result.get");
			System.out.println(obj);
			// Runnable.run is void , the get method always returns null;
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			System.out.println("exception ..." + e);
		} finally {
			if (service != null) {
				service.shutdown();
			}
		}

	}
}
