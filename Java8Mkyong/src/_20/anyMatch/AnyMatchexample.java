package _20.anyMatch;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AnyMatchexample {

	public static void main(String[] args) {

		String[] alphabet = new String[] { "A", "B", "C" };

		// Convert String Array to List
		List<String> list = Arrays.asList(alphabet);

		if (list.contains("A")) {
			System.out.println("Hello A");
		}

		// public boolean equals(Object anObject)
		Predicate<String> p = "A"::equals;

		boolean result = Arrays.stream(alphabet).anyMatch(p);
		if (result) {
			System.out.println("Hello A");
		}

		//
		//
	}
}
