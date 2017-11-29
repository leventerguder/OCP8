package ch03._03.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueuTest {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(12); 
		System.out.println(q); //[10, 12]
		q.remove(1);
		System.out.println(q);
	}
}
