package ch20;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class QX21 {

	int stroke = 0;

	public synchronized void swimming() {
		stroke++;
	}

	public static void main(String[] args) {

		ExecutorService s = Executors.newFixedThreadPool(10);
		QX21 a = new QX21();
		for (int i = 0; i < 1000; i++) {
			s.execute(() -> a.swimming());
		}

		s.shutdown();

		//Even though the method is thread-safe, the value of stroke is read while the threads may still be executing.
		//If the ExecutorService method awaitTermination() is called before the value of stroke is
		// printed and enough time elapses, then the result would be 1000,
		System.out.println(a.stroke);

	}

}
