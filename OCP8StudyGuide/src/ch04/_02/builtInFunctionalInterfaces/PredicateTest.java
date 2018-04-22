package ch04._02.builtInFunctionalInterfaces;

import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		//
		//    String # public boolean isEmpty() {
		Predicate<String> p1 = String::isEmpty;
		Predicate<String> p2 = x -> x.isEmpty();
		//

		System.out.println(p1.test(""));
		System.out.println(p2.test("not empty"));

		//
		// public boolean contains(CharSequence s) 
		Predicate<String> egg = x -> x.contains("egg");

		//
		Predicate<List> ex1 = x -> "".equals(x.get(0));
	}
}
