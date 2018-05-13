package ch15;

import java.util.stream.Stream;

public class QX16 {

	public static void main(String[] args) {
		Stream.of("").sorted((s, t) -> s.length() - t.length());
		// Stream<T> sorted(Comparator<? super T> comparator);
		// int compare(T o1, T o2);
	}
}

// Suppose you have a stream pipeline where all the elements are of type String.
// Which of the following can be passed to the intermediate operation sorted()?