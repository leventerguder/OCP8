package ch20;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.ArrayList;

public class QX37 {

	public static void main(String[] args) {

		// the class uses a synchronized list, which is thread-safe and allows modification
		// from multiple threads,
		List<Integer> db = Collections.synchronizedList(new ArrayList<>());
		
		IntStream.iterate(1, i -> i + 1).limit(5).parallel().map(i -> {
			db.add(i);
			return i;
		}).forEachOrdered(System.out::print);

		System.out.println();
		db.forEach(System.out::print);
		// They are sometimes the same
	}
}
