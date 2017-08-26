package chapter05._02_consumer;

import java.util.function.Consumer;

public class ConsumerTest02 {

	public static void main(String[] args) {
		Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
		printUpperCase.accept("injavawetrust!");
	}
}
