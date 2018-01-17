package ch07._06.raceCondition;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SheepManager {

	private int sheepCount = 0;

	private void incrementAndReport() {
		//System.out.println(++sheepCount + " " + Thread.currentThread().getName());
		System.out.print(++sheepCount + " ");
		// 1 4 2 3 6 5 8 7 9 10 11 12 13 14 15 16 17 18 19 20 20
	}

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(5);
		SheepManager manager = new SheepManager();
		//
		for (int i = 0; i < 20; i++) {
			service.submit(() -> manager.incrementAndReport());
		}
		service.shutdown();

		System.out.println(manager.sheepCount);
	}
}
