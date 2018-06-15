package ch13._08.reviewQuestions;

import java.util.concurrent.locks.*;
import java.util.stream.IntStream;

public class Q7 {

	public static void main(String[] args) {

		// the tryLock method attempts to obtain a lock but returns immediately
		// with a value of false if the lock can not be acquired.
		// The application does not check whether or not the lock was actually
		// acquired;
		
		// therefore the call to unlock() on w3 would produce an
		// IllegalMonitorStateException at runtime if a thread that did not get
		// a lock attempted to release it,

		Lock lock = new ReentrantLock();
		IntStream.iterate(1, i -> 1).limit(10).parallel().forEach(x -> { // w1
			lock.tryLock(); // w2
			System.out.println("Got Lock!");
			lock.unlock(); // w3
		});
		System.out.print("Finished");
	}
}
