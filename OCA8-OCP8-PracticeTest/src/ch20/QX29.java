package ch20;

import java.util.concurrent.atomic.AtomicInteger;

public class QX29 {

	public static void print1(int value) {
		System.out.println(value--);
		System.out.println(++value);
	}
	
	public static void print2(AtomicInteger value){
		System.out.println(value.getAndDecrement());
		System.out.println(value.incrementAndGet());
	}
}

// Which two method names, when filled into the print2() method, produce the
// same output as the print1() method? Assume the input arguments for each
// represent the same non null numeric value, only accessible by a single
// thread at a time.

// D getAndDecrement() , incrementAndGet()