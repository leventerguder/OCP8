package ch13._03.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test01Lock {

	// Lock framework works in a similar manner to the syncronized code!
	// you cant mix and match the Lock framework and the syncronized keyword.
	// Lock framework is an alternative to synchronization.

	public static void main(String[] args) {

		Object object = new Object();
		synchronized (object) {
			//
		}

		Lock lock = new ReentrantLock();
		try {
			lock.lock();
			//
		} finally {
			lock.unlock();
		}
	}
}
