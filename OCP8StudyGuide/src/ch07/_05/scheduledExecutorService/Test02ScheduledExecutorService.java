package ch07._05.scheduledExecutorService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test02ScheduledExecutorService {

	public static void main(String[] args) {

		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		service.scheduleAtFixedRate(() -> System.out.println("test message"), 3, 5, TimeUnit.SECONDS);

		// public ScheduledFuture<?> scheduleAtFixedRate(Runnable command,
		// long initialDelay,
		// long period,
		// TimeUnit unit);
	}
}

// The scheduleAtFixedRate() method creates a new task and submits it to the
// executor every period, regardless of whether or not the previous task
// finished.