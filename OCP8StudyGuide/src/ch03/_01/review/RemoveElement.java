package ch03._01.review;

import java.util.List;
import java.util.ArrayList;

public class RemoveElement {

	public static void main(String[] args) {
		//
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(new Integer(3));
		numbers.add(new Integer(5)); // 1 3 5
		numbers.remove(1); // 1 5
		numbers.remove(new Integer(5)); // 1
		System.out.println(numbers); //
	}
}
