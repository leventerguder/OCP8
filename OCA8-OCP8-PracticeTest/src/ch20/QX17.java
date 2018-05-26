package ch20;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class QX17 {

	public static void main(String[] args) {
		Race race = new Race();
		race.service.execute(() -> Race.hare());
		race.service.execute(()-> Race.tortoise());
		
		// The result is unknown until runtime.
	}
}

// invokeAll method causes the current thread to wait until all tasks are finished.
// The invokeAny() method will cause the current thread to wait until at least one task is complete.

class Race {

	static ExecutorService service = Executors.newFixedThreadPool(8);

	public static int sleep() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {

		}
		return 1;
	}

	public static void hare() {

		try {
			Callable c = () -> sleep();
			final Collection<Callable<Integer>> r = Arrays.asList(c, c, c);
			List<Future<Integer>> results = service.invokeAll(r);
			System.out.println("Hare won the race!");
		} catch (Exception e) {
		}

	}

	public static void tortoise() {
		try {
			Callable c = () -> sleep();
			final Collection<Callable<Integer>> r = Arrays.asList(c, c, c);
			Integer result = service.invokeAny(r);
			System.out.println("Tortoise won the race!");
		} catch (Exception e) {
		}
		// throws InterruptedException, ExecutionException;
	}

}