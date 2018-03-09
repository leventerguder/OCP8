package ch07._06.raceCondition;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SheepManager {

	private int sheepCount = 0;

	private void incrementAndReport() {
		System.out.print(++sheepCount + " ");
		// 1 5 4 6 2 3 7 8 9 10
	}

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(20);
		SheepManager manager = new SheepManager();
		//
		for (int i = 0; i < 10; i++) {
			service.submit(() -> manager.incrementAndReport());
		}
		service.shutdown();
	}
}

// 1 2 2 3 4 5 6 7 8 9  ( We know that we had 10 workers, but the results are incomplete and out of order.)
// 2 4 5 6 7 8 1 9 10 3
// 2 1 3 4 5 6 7 8 9 10