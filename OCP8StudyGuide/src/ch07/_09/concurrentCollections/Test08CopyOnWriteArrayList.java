package ch07._09.concurrentCollections;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test08CopyOnWriteArrayList {

	public static void main(String[] args) {
		List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4, 3, 52));
		for (Integer item : list) {
			System.out.print(item + " ");
			list.add(9);
		}
		System.out.println();
		System.out.println(list);
		// Alternatively , if we had used a regular ArrayList object , a
		// ConcurrentModificationException wold have been thrown at runtime.
	}
}