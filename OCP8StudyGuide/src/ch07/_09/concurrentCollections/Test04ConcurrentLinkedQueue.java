package ch07._09.concurrentCollections;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Test04ConcurrentLinkedQueue {

	public static void main(String[] args) {

		Queue<Integer> queue = new ConcurrentLinkedQueue<>();
		queue.offer(20);
		queue.offer(30);
		queue.add(40);
		// 20 30 40
		//
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}
}

// public boolean add(E e) {
// return offer(e);
// }
