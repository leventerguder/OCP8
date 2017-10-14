package chapter04;

import java.util.stream.Stream;

public class StreamPeekTest {

	public static void main(String[] args) {
		Stream.of(1, 2, 3, 4, 5)
        .peek(i -> System.out.printf("%d ", i))
        .map(i -> i * i)
        .peek(i -> System.out.printf("%d ", i))
        .count();

	}
}
