package ch03._03.collections;

import java.util.ArrayDeque;

public class ArrayDequeTest2 {

	public static void main(String[] args) {
		ArrayDeque<String> queue = new ArrayDeque<>();
		queue.push("hello");
		queue.push("hi");
		queue.push("ola");

		System.out.println(queue); // [ola, hi, hello]
		System.out.println(queue.pop());
		System.out.println(queue.peek());

		while (queue.peek() != null) {
			System.out.print(queue.pop());
		}
	}
}
