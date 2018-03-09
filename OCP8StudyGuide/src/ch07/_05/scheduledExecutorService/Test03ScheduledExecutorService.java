package ch07._05.scheduledExecutorService;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test03ScheduledExecutorService {

	public static void main(String[] args) {

		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		service.scheduleWithFixedDelay(() -> System.out.println(LocalTime.now()), 3, 5, TimeUnit.SECONDS);

		// public ScheduledFuture<?> scheduleWithFixedDelay(Runnable command,
		// long initialDelay,
		// long delay,
		// TimeUnit unit);
	}
}

// the scheduleWithFixedDelay() method creates a new task after the previous
// task has finished.

// For example, if the first task runs at 12:00 and takes five minutes to finish, with
// a period of 2 minutes, then the second task will start at 12:07.

// service.scheduleWithFixedDelay(command,0,2,TimeUnit.MINUTE);
