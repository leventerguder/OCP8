package ch07._16.reviewQuestions;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class QX14 {

	public static void main(String[] args) throws InterruptedException {
		BlockingDeque<Integer> deque = new LinkedBlockingDeque<Integer>();
		addAndPrintItems(deque);
	}
	
	public static void addAndPrintItems(BlockingDeque<Integer> deque) throws InterruptedException {
		
		deque.offer(103);
		deque.offerFirst(20, 1, TimeUnit.SECONDS);
		deque.offerLast(85, 7, TimeUnit.HOURS);

		System.out.println(deque);
		
		System.out.print(deque.pollFirst(200, TimeUnit.NANOSECONDS));
		System.out.print(" " + deque.pollLast(1, TimeUnit.MINUTES));
	}
}
