package chapter05._01_predicate;

import java.util.function.Predicate;

public class PredicateTest02 {

	public static void main(String[] args) {
		Predicate<String> nullCheck = arg -> arg != null;
		Predicate<String> emptyCheck = arg -> arg.length() > 0;
		Predicate<String> nullAndEmptyCheck = nullCheck.and(emptyCheck);

		String helloStr = "hello";
		String nullStr = null;
		//
		System.out.println(nullAndEmptyCheck.test(helloStr));
		System.out.println(nullAndEmptyCheck.test(nullStr));
	}
}

// This functional interface also defines default methods named and() and or()
// that take a Predicate and return a Predicate.
