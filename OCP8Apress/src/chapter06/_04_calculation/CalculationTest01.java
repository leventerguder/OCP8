package chapter06._04_calculation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class CalculationTest01 {

	public static void main(String[] args) {
		String[] words = "you never know what you have until you clean your room".split(" ");
		//

		System.out.println(Arrays.stream(words).min(String::compareTo).get());

		Function<CalculationTest01, Integer> f1 = CalculationTest01::length;
		// burada length metodu parametre almiyor.
		// benzer sekilde String sinifinda da length metodu parametre almiyor
		// kendisini kullaniyor.
		// burada direkt olarak static metottan bu sekilde erisim
		// saglanabiliyor.
		Function<String, Integer> f2 = String::length;

		//
		// Function<String, Integer> c1 = String::compareTo; //compile error.

		// burada ise derleme hatasi vermektedir.
		// bu metot parametre olarak da string almakta boyle bir senaryoda obje
		// olmasi gerekli.
		// public int compareTo(String anotherString) {
		Function<String, Integer> c2 = new String()::compareTo;

		//
		Comparator<String> comp = (str1, str2) -> str1.compareTo(str2);
		System.out.println(Arrays.stream(words).min(comp).get());

	}

	// private char value[];
	public int length() {
		return 0;
		// return value.length;
	}
}
