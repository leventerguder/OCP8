package ch23;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class QX79 {

	private ExecutorService service = Executors.newCachedThreadPool();

	public static void main(String[] args) {

	}

	public void plantEvents() {
		// service.scheduleWithFixedDelay(() -> System.out.print("Check food stock"), 1, TimeUnit.HOURS); //compile error
		// service.scheduleAtFixedRate(() -> System.out.print("Check drink stock"), 1, 1000, TimeUnit.SECONDS); //compile error
		service.execute(() -> System.out.print("Take out trash"));
	}
}

// III. The execute() method call compiles.