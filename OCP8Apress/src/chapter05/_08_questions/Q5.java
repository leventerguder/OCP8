package chapter05._08_questions;

import java.util.function.BiFunction;

public class Q5 {

	public static void main(String[] args) {
		BiFunction<String, String, Boolean> compareString = (x, y) -> x.equals(y);
		//
		System.out.println(compareString.apply("java8", "java8"));
	}
}
