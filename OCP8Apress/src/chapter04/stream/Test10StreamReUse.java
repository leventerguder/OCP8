package chapter04.stream;

import java.util.stream.IntStream;

public class Test10StreamReUse {

	public static void main(String[] args) {
		IntStream chars = "IllegalStateException will throw!".chars();
		System.out.println(chars.count());
		//
		// java.lang.IllegalStateException: stream has already been operated
		// upon or closed
		// chars.distinct().sorted().forEach(System.out::println);
	}
}

// You can use a stream only once. Any attempt at reusing the stream (for
// example, by calling intermediate or terminal operations) will result in
// throwing an IllegalStateException.