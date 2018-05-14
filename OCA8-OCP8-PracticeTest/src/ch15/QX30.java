package ch15;

import java.util.stream.Stream;

public class QX30 {

	public static void main(String[] args) {
		Stream.of("test").filter(p -> p.equals("test")).forEach(System.out::println);
		//
		
	}
}

// Suppose you have a stream with one element and the code
// stream.xxxx.forEach(System.out::println). Filling in xxxx from top to bottom
// in the table, how many elements can be printed out?

// A. Zero or one, zero or more, exactly one

//A. The filter() method either passes along a given element or doesn’t, making Option D
//incorrect. The flatMap() method doesn’t pass along any elements for empty streams. For
//non-empty streams, it flattens the elements, allowing it to return zero or more elements.
//This makes Option B incorrect. Finally, the map() method applies a one-to-one function for
//each element. It has to return exactly one element, so Option A is the correct answer.