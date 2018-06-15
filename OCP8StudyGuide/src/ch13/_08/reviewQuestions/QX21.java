package ch13._08.reviewQuestions;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class QX21 {

	public static void main(String[] args) {

		Lock lock = new ReentrantLock();
		ExecutorService service = null;

		try {
			service = Executors.newFixedThreadPool(2);
			for (int i = 0; i < 2; i++)
				service.submit(() -> BeachManager.goSwimming(lock));
		} finally {
			if (service != null)
				service.shutdown();
		}
		System.out.print("Tasks Complete");
	}
}

// It hangs indefinitely at runtime

// goSwimming method performs two lock requests via lock  and tryLock
// but it has only one call to unlock()
/// a thread must call unlock the same number of times it locks the object , or else the lock will not be released.
// therefore, only one thread is able to acquirer the lock and print Swim!

class BeachManager {
	public static void goSwimming(Lock lock) {
		try {
			lock.lock(); // y1
			if (lock.tryLock()) { // y2
				System.out.println("Swim!");
			}
		} finally {
			lock.unlock();
		}
	}
}