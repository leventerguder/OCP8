package ch07._07.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Test01Atomic {

	public static void main(String[] args) {

		AtomicInteger atomicInteger = new AtomicInteger(10);
		int value1 = atomicInteger.incrementAndGet();
		int value2 = atomicInteger.getAndIncrement();
		int value3 = atomicInteger.addAndGet(10);

		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(atomicInteger);

	}
}
