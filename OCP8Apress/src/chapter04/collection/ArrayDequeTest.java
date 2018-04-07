package chapter04.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeTest {

	// Deque (double ended queue) is a data structure that allows you to insert
	// and reomve elements from both the ends.
	// Dequee extends Queue interface

	// implementation of Deque interface; LinkedList , ArrayDeque ,
	// LinkedBlockingDeque
	//
	public static void main(String[] args) {

		Deque<Integer> deque = new ArrayDeque<>();
		//
		deque.add(100);
		deque.add(10);
		deque.addLast(200);
		// 100 , 10 , 200
		deque.push(500);
		// 500 , 100, 10 , 200
		deque.offer(300);
		// 500 , 100, 10, 200, 300
		
		System.out.println(deque);
		//
		
		deque.pop();
		deque.remove();
		deque.removeLast();
		//
		System.out.println(deque);
	}
}

// public boolean add(E e) {
// addLast(e);
// return true;
// }

// public void push(E e) {
// addFirst(e);
// }

// public boolean offer(E e) {
// return offerLast(e);
// }

// public boolean offerLast(E e) {
// addLast(e);
// return true;
// }

//
//public E pop() {
//    return removeFirst();
//}

//public E remove() {
//    return removeFirst();
//}