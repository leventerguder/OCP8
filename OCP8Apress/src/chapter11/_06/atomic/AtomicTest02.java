package chapter11._06.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest02 {

	public static void main(String[] args) {
		AtomicInteger ai = new AtomicInteger(10);
		System.out.println(ai.getAndIncrement());
		System.out.println(ai.incrementAndGet());
		System.out.println(ai.addAndGet(5));
		System.out.println(ai.getAndAdd(5));
		System.out.println(ai);
	}
}
