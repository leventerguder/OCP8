package chapter05._03_function;

import java.util.function.Function;

public class _02_FunctionTest {

	public static void main(String[] args) {
		Function<String, Integer> strLength = str -> str.length();

		Integer length = strLength.apply("www.injavawetrust.com");
		System.out.println(length);
	}
}
