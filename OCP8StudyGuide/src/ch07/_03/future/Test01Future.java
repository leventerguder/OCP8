package ch07._03.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Test01Future {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService service = Executors.newSingleThreadExecutor();
		Future<?> future = service.submit(() -> System.out.println("Hello Future object!"));

		service.shutdown();
		boolean isDone = future.isDone();

		boolean isShutdown = service.isShutdown();
		boolean isTerminated = service.isTerminated();

		// check wheter task is finished!
		service.awaitTermination(1, TimeUnit.MINUTES);

		System.out.println(isDone);
		System.out.println(isShutdown);
		System.out.println(isTerminated);
	}
}
