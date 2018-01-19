package ch07._10.synhcronizedCollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test01SynchronizedCollectionTest {

	public static void main(String[] args) {

		// If you know at the time of creation that your object requires
		// synchronization, then you should use one of the concurrent collection
		// classes listed

		// On the other hand, if you are given an existing collection that is
		// not a concurrent class and need to access it among multiple threads,
		// you can wrap it using the methods

		// synchronize access to the data elements, such as the get() and set()
		// methods
		// they do not synchronize access on any iterators that you may create
		// from the synchronized collection
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list = Collections.synchronizedList(numbers);

		synchronized (list) {
			list.forEach(System.out::println);
		}

		//
	}
}
