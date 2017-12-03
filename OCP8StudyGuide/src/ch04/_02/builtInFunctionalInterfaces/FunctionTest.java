package ch04._02.builtInFunctionalInterfaces;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		// public int length() 
		Function<String, Integer> f1 = String::length;
		Function<String, Integer> f2 = x -> x.length();
		
		System.out.println(f1.apply("levent"));
		System.out.println(f2.apply("java"));
	}
}
