package chapter05._05_primitives;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class PrimitiveConsumerTest01 {

	public static void main(String[] args) {

		// IntConsumer void accept(int value)
		// LongConsumer void accept(long value)
		// DoubleConsumer void accept(double value)

		IntConsumer intC = System.out::println; // void println(int x)
		intC.accept(10);
	}

}
