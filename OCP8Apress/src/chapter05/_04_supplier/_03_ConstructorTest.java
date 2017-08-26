package chapter05._04_supplier;

import java.util.function.Function;
import java.util.function.Supplier;

public class _03_ConstructorTest {

	public static void main(String[] args) {
		Supplier<String> newString = String::new; // public String()
		//
		// This code makes use of constructor references. This code is
		// equivalent to:
		Supplier<String> newString2 = () -> new String();

		//

		Function<String, Integer> i = Integer::new; // Integer(String s)
		// We cannot use a Supplier here because Suppliers do not take any
		// arguments. Functions do take arguments and the return type here is
		// Integer, and hence we can use Function<String, Integer>.
	}
}
