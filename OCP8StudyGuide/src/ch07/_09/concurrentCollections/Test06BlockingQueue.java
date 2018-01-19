package ch07._09.concurrentCollections;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Test06BlockingQueue {

	public static void main(String[] args) throws InterruptedException {

		BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
		blockingQueue.offer(20);
		blockingQueue.offer(40, 2, TimeUnit.SECONDS);
		//
		System.out.println(blockingQueue.poll());
		System.out.println(blockingQueue.poll(10, TimeUnit.MILLISECONDS));
	}
}
