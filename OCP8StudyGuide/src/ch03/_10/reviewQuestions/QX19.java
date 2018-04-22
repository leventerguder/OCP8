package ch03._10.reviewQuestions;

import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class QX19 {

	public static void main(String[] args) {
		//
		List<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(12);
		q.remove(1);
		// E remove(int index);
		System.out.println(q);
		//

		Queue<Integer> q2 = new LinkedList<>();
		q2.add(10);
		q2.add(12);
		q2.remove(1);
		// boolean remove(Object o);
		System.out.println(q2);
	}
}
