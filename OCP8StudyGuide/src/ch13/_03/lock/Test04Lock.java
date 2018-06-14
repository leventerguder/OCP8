package ch13._03.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test04Lock {

	// void tryLock()
	// The tryLock method will attempt to acquire a lock and immediately return
	// a boolean result indicating whether or not the lock was obtained.

	// Unlike the lock() method , it does not wait if another thread already
	// holds the lock.
	
	public static void main(String[] args) {

		Lock lock = new ReentrantLock();
		if (lock.tryLock()) {
			try {
				System.out.println("tryLock...");
			} finally {
				lock.unlock();
				//it should be used wit a try/finally block to ensure that the lock is released!
				//we only need to release the lock with unlock() if it was successfully acquired.
			}

		} else {
			System.out.println("Unable to acquire lock, doing something else");
		}
	}
}
