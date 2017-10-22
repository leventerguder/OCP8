package mock;

import java.util.stream.Stream;

public class Q1 {

	public static void main(String[] args) {
		Stream.of("ace ", "jack ", "queen ", "king ", "joker ").mapToInt(card -> card.length()).filter(len -> len > 3)
				.peek(System.out::print).limit(2);
	}
}
