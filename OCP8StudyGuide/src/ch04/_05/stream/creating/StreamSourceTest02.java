package ch04._05.stream.creating;

import java.util.stream.Stream;

public class StreamSourceTest02 {

	public static void main(String[] args) {
		Stream<Double> s0 = Stream.generate(Math::random);
		Stream<Integer> s1 = Stream.iterate(1, n -> n + 2);
		
		// public static<T> Stream<T> generate(Supplier<T> s) 
		//public static<T> Stream<T> iterate(final T seed, final UnaryOperator<T> f)
	}
}
