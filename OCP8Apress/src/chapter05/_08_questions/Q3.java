package chapter05._08_questions;

import java.util.function.Function;

public class Q3 {

	public static void main(String[] args) {
		Function<Integer, Integer> negate = (i -> -i), square = (i -> i * i), negateSquare = negate.compose(square);
		//
		System.out.println(negateSquare.apply(10));
		// -100
	}
}
