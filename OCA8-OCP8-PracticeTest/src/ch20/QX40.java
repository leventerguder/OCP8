package ch20;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class QX40 {

	public static void main(String[] args) {

		ScheduledExecutorService t = Executors.newSingleThreadScheduledExecutor();
		// Future result = t.execute(System.out::println); //compile error
		// t.invokeAll(null);
		// t.scheduleAtFixedRate(() -> {return;}, 5, TimeUnit.MINUTES); //
		// compile error
	}
}
