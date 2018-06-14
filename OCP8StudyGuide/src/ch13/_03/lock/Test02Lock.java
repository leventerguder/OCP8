package ch13._03.lock;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class Test02Lock {
	
	// if the unlock() method is never called after obtaining a lock , other
	// threads that try to obtain the lock will wait indefinitely.

	public static void main(String[] args) {

		Lock lock = new ReentrantLock();

		try {
			lock.lock();
			// implementation details
		} finally {
			lock.unlock();
		}
	}
}
