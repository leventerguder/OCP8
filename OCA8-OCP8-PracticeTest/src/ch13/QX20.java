package ch13;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class QX20 {

	public static void main(String[] args) {
		//
		Comparator<Integer> c = (x, y) -> y - x;
		List<Integer> ints = Arrays.asList(3, 1, 4);
		Collections.sort(ints, c); // 4 3 1
		System.out.println(ints);
		System.out.println(Collections.binarySearch(ints, 1));

	}

}
