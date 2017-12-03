package ch04._02.builtInFunctionalInterfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorTest {

	public static void main(String[] args) {
		BinaryOperator<String> b1 = String::concat;
		BinaryOperator<String> b2 = (str, toAdd) -> str.concat(toAdd);

		System.out.println(b1.apply("injava", "wetrust"));
		System.out.println(b2.apply("injava", "wetrust"));

	}
}
