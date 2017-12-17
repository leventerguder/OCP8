package ch04._02.builtInFunctionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateTest {

	public static void main(String[] args) {

		// public boolean startsWith(String prefix)
		BiPredicate<String, String> b1 = String::startsWith;
		BiPredicate<String, String> b2 = (t, u) -> t.startsWith(u);

		System.out.println(b1.test("chicken", "chick"));
		System.out.println(b2.test("chicken", "chick"));

		//
		// public boolean contains(CharSequence s)
		BiPredicate<String, String> b3 = String::contains;

		BiFunction<String, String, Boolean> f1 = String :: contains;
		
		System.out.println(b3.test("java", "v"));
		
		//
	}
}
