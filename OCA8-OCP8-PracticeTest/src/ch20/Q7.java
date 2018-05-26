package ch20;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Q7 {

}

class TpsReport {

	public void submitReports() {
		ExecutorService service = Executors.newCachedThreadPool();
		Future bosses = service.submit(() -> System.out.print(""));
		service.shutdown();
		// System.out.println(bosses.get()); //compile error
		// V get() throws InterruptedException, ExecutionException;
	}
}

// Future.get()  throws
// InterruptedException and ExecutionException,