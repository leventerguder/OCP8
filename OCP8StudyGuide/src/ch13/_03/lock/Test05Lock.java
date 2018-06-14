package ch13._03.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test05Lock {

	public static void main(String[] args) throws InterruptedException {
		// Lock interface uncludes an overloaded version of tryLock() and waits
		// up to a specified amount of time trying to acuire a lock.

		Lock lock = new ReentrantLock();
		if (lock.tryLock(10, TimeUnit.SECONDS)) {

			try {

			} finally {
				lock.unlock();
			}
		}
	}
}
