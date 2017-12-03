package ch04._02.builtInFunctionalInterfaces;

import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		// public void println(String x)
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = x -> System.out.println(x);
		
		// void accept(T t);
		c1.accept("levent");
		c2.accept("levent");
	}
}
