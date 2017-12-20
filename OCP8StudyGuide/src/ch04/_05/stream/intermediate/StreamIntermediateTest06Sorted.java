package ch04._05.stream.intermediate;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamIntermediateTest06Sorted {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("brown-", "bear-");
		s.sorted().forEach(System.out::print);

		//
		Stream<String> s2 = Stream.of("brown bear-", "grizzly-");
		Comparator<String> com = Comparator.reverseOrder();
		// int compare(T o1, T o2);
		s2.sorted(com).forEach(System.out::print);

		// s.sorted(Comparator::reverseOrder); // DOES NOT COMPILE
		// Take a look at the method signatures again. Comparator is a
		// functional interface. This means that we can use method references or
		// lambdas to implement it. The Comparator interface implements one
		// method that takes two String parameters and returns an int. However,
		// Comparator::reverseOrder doesn’t do that. It is a reference to a
		// function that takes zero parameters and returns a Comparator. This is
		// not compatible with the interface. This means that we have to use a
		// method and not a method reference.
	}

}
