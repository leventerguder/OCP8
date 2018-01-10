package chapter11._06.atomic;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicTest {

	public static void main(String[] args) {
		AtomicBoolean ab = new AtomicBoolean();
		ab.set(true);
		
		AtomicInteger ai = new AtomicInteger();
		ai.set(10);
		
		AtomicIntegerArray aia = new AtomicIntegerArray(5);
		aia.set(0, 10);
		
		System.out.println(ab);
		System.out.println(ai);
		System.out.println(aia);
		
	}
}
