package ch04._07.reviewQuestions;

import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Qx12 {

	public static void main(String[] args) {
		Supplier<String> x = String::new;
		// public String() {
		// T get();

		BiConsumer<String, String> y = (a, b) -> System.out.println();

		UnaryOperator<String> z = a -> a + a;
		
	}
}
