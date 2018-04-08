package chapter05._06_binary;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionTest02 {

	public static void main(String[] args) {
		// public String toUpperCase() {
		// return toUpperCase(Locale.getDefault());
		// }
		Function<String, String> str1 = String::toUpperCase;

		// public String toLowerCase(Locale locale) {
		Function<Locale, String> str2 = new String()::toLowerCase;

		// public String toLowerCase(Locale locale) {
		BiFunction<String, Locale, String> str3 = String::toLowerCase;

		Function<BiFunctionTest02, Integer> f1 = BiFunctionTest02::length;
		// burada length metodu parametre almiyor.
		// benzer sekilde String sinifinda da length metodu parametre almiyor
		// kendisini kullaniyor.
		// burada direkt olarak static metottan bu sekilde erisim
		// saglanabiliyor.

		Function<String, Integer> f2 = String::length;
		// public int length() {

		// Function<String, Integer> c1 = String::compareTo; //compile error.
		BiFunction<String, String, Integer> bif = String::compareTo;
		// public int compareTo(String anotherString)

		// burada ise derleme hatasi vermektedir.
		// bu metot parametre olarak da string almakta boyle bir senaryoda obje
		// olmasi gerekli.
		// public int compareTo(String anotherString) {
		Function<String, Integer> c2 = new String()::compareTo;
	}

	// private char value[];
	public int length() {
		return 0;
		// return value.length;
	}
}
