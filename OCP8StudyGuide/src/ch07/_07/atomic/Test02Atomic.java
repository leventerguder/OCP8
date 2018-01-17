package ch07._07.atomic;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class Test02Atomic {

	public static void main(String[] args) {

		AtomicIntegerArray array = new AtomicIntegerArray(5);
		System.out.println(array);

		array.set(0, 10);
		array.set(1, 15);
		array.set(2, 25);
		array.set(3, 35);
		array.set(4, 25);
		
		System.out.println(array);
	}
}
