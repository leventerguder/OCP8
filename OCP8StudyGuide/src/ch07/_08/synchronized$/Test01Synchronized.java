package ch07._08.synchronized$;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test01Synchronized {

	private int sheepCount = 0;

	private void incrementAndReport() {
		synchronized (this) {
			System.out.print(++sheepCount + " ");
		}

	}

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(5);
		Test01Synchronized object = new Test01Synchronized();
		//
		for (int i = 0; i < 20; i++) {
			service.submit(() -> object.incrementAndReport());
		}
		service.shutdown();
	}
}
