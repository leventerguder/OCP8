package ch13._03.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test07ReentrantLock {

	// we attempt to lock the object twice in one thread using the lock() method
	// and once in a separate thread using the tryLock method

	// unlock() method must be called the same number of times as the lock()!
	
	public static void main(String[] args) {

		Lock lock = new ReentrantLock();
		try {
			lock.lock();
			lock.lock();
		} finally {
			lock.unlock();
		}

		new Thread(() -> {

			if (lock.tryLock()) {
				try {
					System.out.println("Acquired");
				} finally {
					lock.unlock();
				}

			} else {
				System.out.println("Unavailable");
			}

		}).start();
	}
}
