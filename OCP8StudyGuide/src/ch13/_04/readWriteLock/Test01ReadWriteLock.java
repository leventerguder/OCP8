package ch13._04.readWriteLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Test01ReadWriteLock {

	// A single lock guarantees mutually exclusivity of an object it is also
	// costly, as all threads need to wait each time an object is accessed.
	// ReadWriteLock improves concurrency over a single-lock monitor.

	// Lock readLock();
	// Lock writeLock();

	public static void main(String[] args) {

		ReadWriteLock rwLock = new ReentrantReadWriteLock();
		Lock readLock = rwLock.readLock();
		Lock writeLock = rwLock.writeLock();
	}
}
