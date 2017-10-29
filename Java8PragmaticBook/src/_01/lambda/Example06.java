package _01.lambda;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Example06 {

	public static void main(String[] args) {
		// Type Inference
		Predicate<Integer> least = x -> x > 5;
		boolean isLeast=least.test(10);
		System.out.println(isLeast);
		
//		public interface Predicate<T>{
//			boolean test(T t);
//		}
		
		BinaryOperator<Integer> addInteger = (x,y) -> x+y;
		
		//if we remove some if the type information from previous example
		//compile error
		//BinaryOperator compileError = (x,y) -> x+y;

	}
}
