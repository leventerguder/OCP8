package mock;

import java.util.concurrent.atomic.AtomicInteger;

public class QX54 {
	public static void main(String[] args) {
		AtomicInteger i = new AtomicInteger(0);
		increment(i);
		System.out.println(i);
	}

	static void increment(AtomicInteger atomicInt) {
		atomicInt.incrementAndGet();
	}
}
