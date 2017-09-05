package chapter05._06_binary;

import java.util.function.BiPredicate;

//https://coderanch.com/t/683825/certification/BiPredicate-List#3211043
public class BiPredicateTest02 {
	private final String value;

	public BiPredicateTest02(String value) {
		this.value = value;
	}

	public static void main(String[] args) {
		BiPredicate<BiPredicateTest02, String> predicate = BiPredicateTest02::contains;

		System.out.println(predicate.test(new BiPredicateTest02("a;b;c"), "a")); // true
		System.out.println(predicate.test(new BiPredicateTest02("a;b;c"), "d")); // false
	}

	boolean contains(String s) {
		return value.contains(s);
	}
}