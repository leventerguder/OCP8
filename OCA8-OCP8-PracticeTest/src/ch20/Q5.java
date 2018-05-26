package ch20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;

public class Q5 {

	// Given the original array, how many of the following for statements result
	// in an exception at runtime, assuming each is executed independently?

	public static void main(String[] args) {
		List<Integer> original = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		List<Integer> copy1 = new CopyOnWriteArrayList<>(original);
		for (Integer w : copy1)
			copy1.remove(w);

		System.out.println(copy1);

		// java.util.ConcurrentModificationException
//		List<Integer> copy2 = Collections.synchronizedList(original);
//		for (Integer w : copy2)
//			copy2.remove(w);
		
		// java.util.ConcurrentModificationException
//		List<Integer> copy3 = new ArrayList<>(original); 
//		for(Integer w : copy3)
//			copy3.remove(w);
		
		
		Queue<Integer> copy4 = new ConcurrentLinkedQueue<>(original); 
		for(Integer w : copy4)
			copy4.remove(w);
		
	}

}