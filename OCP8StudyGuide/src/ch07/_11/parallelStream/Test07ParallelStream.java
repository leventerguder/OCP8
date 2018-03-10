package ch07._11.parallelStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test07ParallelStream {

	public static void main(String[] args) {

		List<Integer> data = new ArrayList<>();
		Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8).parallelStream().map(i -> {
			data.add(i); // // AVOID STATEFUL LAMBDA EXPRESSIONS!
			return i;
		}).forEachOrdered(i -> System.out.print(i + " "));

		// Anytime you are working with a collection with a parallel stream, it
		// is recommended that you use a concurrent collection.

		// 1 2 3 4 5 6 7 8
		// [1, 3, 4, 5, 2] ->missing !
		System.out.println();
		System.out.println(data);

		// For an ArrayList object, the JVM internally manages a primitive array
		// of the same type. As the size of the dynamic ArrayList grows, a new,
		// larger primitive array is periodically required. If two threads both
		// trigger the array to be resized at the same time, a result can be
		// lost, producing the unexpected value shown here.

	}
}