package ch04._02.builtInFunctionalInterfaces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		// public static LocalDate now()
		Supplier<LocalDate> s1 = LocalDate::now;
		Supplier<LocalDate> s2 = () -> LocalDate.now();
		
		System.out.println(s1);
		
		//
		LocalDate d1 = s1.get();
		LocalDate d2 = s2.get();

		System.out.println(d1);
		System.out.println(d2);

		//
		Supplier<StringBuilder> s3 = StringBuilder::new;
		Supplier<StringBuilder> s4 = () -> new StringBuilder();

		StringBuilder sb1 = s3.get();
		StringBuilder sb2 = s4.get();

		System.out.println(sb1);
		System.out.println(sb2);

		//
		Supplier<ArrayList<String>> s5 = ArrayList<String>::new;

	}
}
