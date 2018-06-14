package ch13._03.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test09ReentrantLock {

	public static void main(String[] args) {

		Lock lock = new ReentrantLock(true);
		// when boolean value is set to true , fairness is enabled
		// and longest waiting thread is guaranteed to obtain the lock the next
		// time it is released

	}
}