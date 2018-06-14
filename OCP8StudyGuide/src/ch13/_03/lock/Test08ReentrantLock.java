package ch13._03.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test08ReentrantLock {

	public static void main(String[] args) {

		// Anytime you see a Lock object on the exam, make sure that it calls
		// unlock() the same of times that it calls lock();
		Lock lock = new ReentrantLock();

		try {
			lock.lock();
			try {
				lock.lock();
			} finally {
				lock.unlock();
			}
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
