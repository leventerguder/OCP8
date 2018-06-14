package ch13._03.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test03Lock {

	// if you attempt to release a lock that you dont have
	// you will get an exception at runtime in the form of an
	// IllegalMonitorStateException

	public static void main(String[] args) {

		Lock lock = new ReentrantLock();
		lock.unlock();
		// java.lang.IllegalMonitorStateException

	}
}
