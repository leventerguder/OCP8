package ch07._07.atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Test03AtomicSheepManager {

	private AtomicInteger sheepCount = new AtomicInteger();

	private void incrementAndReport() {
		// System.out.println(++sheepCount + " " +
		// Thread.currentThread().getName());

		System.out.print(sheepCount.getAndIncrement() + " ");

		// Unlike our previous sample output, the numbers 1 through 20 will
		// always be output

		// The key here is that using the atomic classes ensures that the data
		// is consistent between workers and that no values are lost due to
		// concurrent modi cations
	}

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(5);
		Test03AtomicSheepManager manager = new Test03AtomicSheepManager();
		//
		for (int i = 0; i < 20; i++) {
			service.submit(() -> manager.incrementAndReport());
		}
		service.shutdown();

		System.out.println(manager.sheepCount);
	}
}
