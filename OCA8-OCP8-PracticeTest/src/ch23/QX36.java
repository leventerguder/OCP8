package ch23;

import java.util.ArrayDeque;

public class QX36 {

	// Which statements when inserted independently will throw an exception at
	// runtime?
	// (Choose two.)

	public static void main(String[] args) {

		ArrayDeque<Integer> d = new ArrayDeque<>();
		d.offer(18);

		d.pop();  //pop = removeFirst = remove
		d.pop(); // java.util.NoSuchElementException
	}
}
