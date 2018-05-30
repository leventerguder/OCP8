package ch23;

import java.util.concurrent.atomic.AtomicInteger;

public class QX47 {

	// Assuming the following class is concurrently accessed by numerous
	// threads, which state- ment about the CountSheep class is correct?
}

// D The class is already thread-safe

class CountSheep {
	private static AtomicInteger counter = new AtomicInteger();
	private Object lock = new Object();

	public synchronized int increment1() {
		return counter.incrementAndGet();
	}

	public static synchronized int increment2() {
		return counter.getAndIncrement();
	}

	public int increment3() {
		synchronized (lock) {
			return counter.getAndIncrement();
		}
	}
}
