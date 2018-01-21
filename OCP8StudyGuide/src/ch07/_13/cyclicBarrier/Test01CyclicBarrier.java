package ch07._13.cyclicBarrier;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class LionPenManager {
	private void removeAnimals() {
		System.out.println("Removing animals");
	}

	private void cleanPen() {
		System.out.println("Cleaning the pen");
	}

	private void addAnimals() {
		System.out.println("Adding animals");
	}

	public void performTask() {
		removeAnimals();
		cleanPen();
		addAnimals();
	}

}

public class Test01CyclicBarrier {

	public static void main(String[] args) {

		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(4);
			LionPenManager manager = new LionPenManager();
			for (int i = 0; i < 4; i++)
				service.submit(() -> manager.performTask());
		} finally {
			if (service != null)
				service.shutdown();
		}

	}

}
