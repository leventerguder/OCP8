package chapter05._06_binary;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateTest01 {

	public static void main(String[] args) {
	
		System.out.println();
		BiPredicate<List<Integer>, Integer> listContains = List::contains;
		
		Predicate<Object>  co = BiPredicateTest01::contains;
		//
		//BiPredicate<List<Integer>, Integer> listContainsTest1 = BiPredicateTest01::contains; //compiler error
		BiPredicate<List<Integer>, Integer> listContainsTest2 = BiPredicateTest01::containsTwo;  //OK
	}
	
	static boolean contains(Object o)  {
		return true;
	}
	static boolean containsTwo(Object o, Object o2)  {
		return true;
	}
}
