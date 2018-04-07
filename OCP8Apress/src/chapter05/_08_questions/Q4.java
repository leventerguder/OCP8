package chapter05._08_questions;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Q4 {

	public static void main(String[] args) {
		//
		Function<String, Integer> f1 = Integer::parseInt;
		ToIntFunction<String> f2 = Integer::parseInt;
	}
}
// Which one of the following functional interfaces can you assign the method
// reference Integer::parseInt? Note that the static method parseInt() in
// Integer class takes a String and returns an int, as in: int parseInt(String
// s)