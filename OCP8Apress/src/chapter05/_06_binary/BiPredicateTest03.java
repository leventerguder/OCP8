package chapter05._06_binary;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.BiPredicate;

public class BiPredicateTest03 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3);

		// defining (bi)predicates using explicit parameters
		Predicate<Integer> s1 = (Integer a) -> list.contains(a);
		BiPredicate<List<Integer>, Integer> t1 = (List<Integer> intList, Integer i) -> intList.contains(i);

		// defining (bi)predicates with method references
		Predicate<Integer> s2 = list::contains;
		BiPredicate<List<Integer>, Integer> t2 = List::contains;

		System.out.println(s1.test(1));
		System.out.println(t1.test(list, 1));
		System.out.println(s2.test(4));
		System.out.println(t2.test(list, 3));
	}
}
