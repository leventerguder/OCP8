package ch03._10.reviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class QX15 {

	public static void main(String[] args) {
		Comparator<Integer> c = (o1, o2) -> o2 - 01;
		List<Integer> list = Arrays.asList(5, 4, 7, 1);
		Collections.sort(list, c);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, 1));
	}
}

// The list is sorted in descending order. However, it is searched using the
// default order, which is sorted in ascending order. binarySearch() requires
// both to use the same sort order. Therefore, the precondition for
// binarySearch() is not met and the result is undefined.