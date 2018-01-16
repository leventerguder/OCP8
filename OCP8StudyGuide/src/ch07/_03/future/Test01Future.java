package ch07._03.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test01Future {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService service = Executors.newSingleThreadExecutor();
		Future<?> future = service.submit(() -> System.out.println("Hello Future object!"));

		Thread.sleep(100);
		boolean isDone = future.isDone();
		System.out.println(isDone);
		
		
	}
}
