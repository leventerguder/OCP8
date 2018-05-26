package ch20;

import java.util.Arrays;

public class QX12 {

	public static void main(String[] args) {

		Arrays.asList(1, 2, 3, 4).stream().forEach(System.out::println);
		//

		// Arrays.asList(1,2,3,4).parallel() //compile error
		// .forEachOrdered(System.out::println);

		// Collection interface defines a stream() and parallelStream() method,
		// it does not contain a parallel() method.
	}
}
