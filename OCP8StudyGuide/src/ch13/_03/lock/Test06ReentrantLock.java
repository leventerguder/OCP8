package ch13._03.lock;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;

class SheepManager {

	private int sheepCount = 0;
	private Lock lock = new ReentrantLock();

	void incrementAndReport() {

		try {
			lock.lock();
			System.out.print(" " + (++sheepCount));
		} finally {
			lock.unlock();
		}

	}
}

public class Test06ReentrantLock {

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(20);
		SheepManager manager = new SheepManager();

		try {
			for (int i = 0; i < 10; i++) {
				service.submit(() -> manager.incrementAndReport());
			}
		} finally {
			if (service != null)
				service.shutdown();
		}

	}

}
