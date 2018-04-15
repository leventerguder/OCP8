package mock;

import java.util.Arrays;
import java.util.List;

public class QX75 {

	public static void main(String[] args) {

		List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
		ints.removeIf(i -> (i % 2 == 0)); // java.lang.UnsupportedOperationException
		System.out.println(ints);
	}
}
// The underlying List object returned by Arrays.asList() method is a fixed-size
// list and hence we cannot remove elements from that list. Hence calling
// removeIf() method on this list results in throwing an
// UnsupportedOperationException.