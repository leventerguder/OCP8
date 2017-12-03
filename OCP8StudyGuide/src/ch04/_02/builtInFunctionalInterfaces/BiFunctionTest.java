package ch04._02.builtInFunctionalInterfaces;

import java.util.function.BiFunction;

public class BiFunctionTest {

	public static void main(String[] args) {
		// public String concat(String str)
		BiFunction<String, String, String> b1 = String::concat;
		BiFunction<String, String, String> b2 = (str, toAdd) -> str.concat(toAdd);
		
		//
		System.out.println(b1.apply("injava", "wetrust"));
		System.out.println(b2.apply("injava", "wetrust"));
	}
}
