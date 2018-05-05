package ch07._16.reviewQuestions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class QX17 {

	private static AtomicInteger sheepCount1 = new AtomicInteger(0);
	private static int sheepCount2 = 0;

	public static void main(String[] args) throws InterruptedException {

		// The key aspect to notice in the code is that a single-thread executor
		// is used, meaning that no task will be executed concurrently.
		// Therefore, the results are valid and predictable with 100 100 being
		// the output
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			//
			for (int i = 0; i < 100; i++)
				service.execute(() -> {
					sheepCount1.getAndIncrement();
					sheepCount2++;
				});
			//
			Thread.sleep(100);
			System.out.println(sheepCount1 + " " + sheepCount2);

		} finally {
			if (service != null)
				service.shutdown();
		}

	}

}
