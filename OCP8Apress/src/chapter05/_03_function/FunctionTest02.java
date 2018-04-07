package chapter05._03_function;

import java.util.function.Function;

public class FunctionTest02 {

	public static void main(String[] args) {

		Function<String, Integer> strLength = str -> str.length();
		Function<String, Integer> strLength2 = String::length;

		Integer length = strLength.apply("www.injavawetrust.com");
		Integer length2 = strLength2.apply("www.injavawetrust.com");

		System.out.println(length);
		System.out.println(length2);
	}
}

// java.lang.String
// public int length() {
// return value.length;
// }
