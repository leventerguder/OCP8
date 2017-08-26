package chapter05._05_primitives;

import java.util.function.IntConsumer;

public class PrimitiveConsumerTest01 {

	public static void main(String[] args) {

		IntConsumer intC = System.out::println; //void println(int x)
		intC.accept(10);
	}

}
