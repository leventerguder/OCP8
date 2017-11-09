package ch03;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeTest {

	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<>();
		System.out.println(queue.offer(10));
		System.out.println(queue.add(10));
		System.out.println(queue.offer(10));
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue.peek());

		//
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		stack.push(100);
		stack.push(20);
		stack.offer(40);
		//stack.add(null);// NullPointerException
		System.out.println(stack);
	}
}
