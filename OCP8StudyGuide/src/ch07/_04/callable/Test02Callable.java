package ch07._04.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test02Callable {

	public static void main(String[] args) throws InterruptedException {

		ExecutorService service = Executors.newSingleThreadExecutor();
		System.out.println(service.getClass());
		
		Future<Integer> result = service.submit(() -> 30 + 20);
		try {
			System.out.println(result.get());
			System.out.println(result.isDone());
			System.out.println(result.isCancelled());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} finally {
			if (service != null) {
				service.shutdown();
			}
			System.out.println(service.isShutdown());
			Thread.sleep(1000);
			System.out.println(service.isTerminated());
		}
	}
}
