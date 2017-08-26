package chapter05._02_consumer;

import java.util.function.Consumer;

public class _02_ConsumerTest {

	public static void main(String[] args) {
		Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
		printUpperCase.accept("injavawetrust!");
	}
}
