package ch15;

import java.util.stream.IntStream;

public class Q5 {

	public static void main(String[] args) {

		IntStream s = IntStream.empty();
		System.out.println(s.average().getAsDouble());
		// java.util.NoSuchElementException: No value present
	}

}
