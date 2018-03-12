package ch07._16.reviewQuestions;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// Which lines need to be changed to make the code compile? (Choose all that apply.)
public class Q3 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newSingleThreadScheduledExecutor();
		((ScheduledExecutorService) service).scheduleWithFixedDelay(() -> { // w1
			System.out.println("Open Zoo");
			// return null; // w2
		}, 0, 1, TimeUnit.MINUTES);
		Future<?> result = service.submit(() -> System.out.println("Wake Staff")); // w3
		System.out.println(result.get());
	}
}
