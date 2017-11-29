package ch03._03.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeTest {

	public static void main(String[] args) {

		Queue<Integer> queue = new ArrayDeque<>();
		System.out.println(queue.offer(10)); // 10
		System.out.println(queue.add(20)); // 10 20
		System.out.println(queue.offer(30)); // 10 20 30
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue.peek());

		System.out.println();
		//
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		stack.push(100);// 100
		stack.push(20); // 20 100
		stack.offer(40); // 20 100 40
		System.out.println(stack.remove());
		System.out.println(stack.poll());
		System.out.println(stack.poll());

		// stack.add(null);// NullPointerException
		System.out.println(stack);
	}
}
