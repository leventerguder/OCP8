package chapter05._08_questions;

import java.util.function.Predicate;

public class Q2 {

	public static void main(String[] args) {
		
		Predicate<String> notNull = ((Predicate<String>) (arg -> arg == null)).negate();
		System.out.println(notNull.test(null));

		// false
	}
}
