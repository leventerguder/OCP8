package chapter05._06_binary;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateTest01 {

	public static void main(String[] args) {
	
		// boolean contains(Object o);
		BiPredicate<List<Integer>, Integer> listContains = List::contains;
		BiPredicate<List<Integer>, Integer> listContains2 = (List<Integer> list , Integer i) -> list.contains(i);
		
		Predicate<Object> contains = BiPredicateTest01::contains;
		//
		//BiPredicate<List<Integer>, Integer> listContainsTest1 = BiPredicateTest01::contains; //compiler error
		BiPredicate<List<Integer>, Integer> listContainsTest2 = BiPredicateTest01::containsTwo;  //OK
	}
	
	static boolean contains(Object o)  {
		return true;
	}
	static boolean containsTwo(List<Integer> o, Integer o2)  {
		return true;
	}
}
