package ch20;

import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;

public class QX33 {

	// Given the original array, how many of the following for statements result
	// in an infinite loop at runtime, assuming each is executed independently?
	// A. Zero
	public static void main(String[] args) {

		List<Integer> original = new ArrayList<>(Arrays.asList(1, 2, 3));

		// java.util.ConcurrentModificationException
		// List<Integer> copy1 = new ArrayList<>(original);
		// for (Integer q : copy1)
		// copy1.add(1);

		List<Integer> copy2 = new CopyOnWriteArrayList<>(original);
		for (Integer q : copy2)
			copy2.add(2);

		Deque<Integer> copy3 = new ConcurrentLinkedDeque<>(original);
		for (Integer q : copy3)
			copy3.push(3);

		//java.util.ConcurrentModificationException
//		List<Integer> copy4 = Collections.synchronizedList(original);
//		for (Integer q : copy4)
//			copy4.add(4);
	}
}