package ch07._05.scheduledExecutorService;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Test01ScheduledExecutorService {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		Runnable task1 = () -> System.out.println("task1 message!");
		Callable<String> task2 = () -> {
			System.out.println("task2 message");
			return "content";
		};
		//

		//scheduled 3 seconds in the future
		ScheduledFuture<?> result1 = service.schedule(task1, 3, TimeUnit.SECONDS);
		//scheduled 2 seconds in the future
		ScheduledFuture<String> result2 = service.schedule(task2, 2, TimeUnit.SECONDS);
		//

		System.out.println(result1.get());
		System.out.println(result2.get());
		
		service.shutdown();
	}
}
