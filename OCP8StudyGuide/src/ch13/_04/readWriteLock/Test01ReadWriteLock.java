package ch13._04.readWriteLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Test01ReadWriteLock {

	// A single lock guarantees mutually exclusivity of an object it is also
	// costly, as all threads need to wait each time an object is accessed.
	// ReadWriteLock improves concurrency over a single-lock monitor.

	// Lock readLock();
	// if no threads have locked the ReadWriteLock for writing
	// and no thread have requested a write lock (but not yet obtained it)
	// Thus multiple threads can the lock for reading.

	// Lock writeLock();
	// if no threads are reading or writing
	// Thus only one thread at a time can lock the lock for writing.
	// http://tutorials.jenkov.com/java-util-concurrent/readwritelock.html

	public static void main(String[] args) {

		ReadWriteLock rwLock = new ReentrantReadWriteLock();

		Lock readLock = rwLock.readLock();

		readLock.lock();

		/*
		 * multiple readers can enter this section if not locked for writing ,
		 * and not writers waiting to lock for writing
		 */

		readLock.unlock();

		Lock writeLock = rwLock.writeLock();

		writeLock.lock();

		/*
		 * Only one writer can enter this section, and only if no threads are
		 * currently reading
		 */

		// The idea is that many threads can be granted a lock to read the
		// object, but a write object is special and can be granted only if no
		// threads are holding any locks on the object
		writeLock.unlock();
	}
}
