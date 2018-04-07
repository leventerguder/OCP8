package chapter05._05_primitives;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveSupplierTest01 {

	public static void main(String[] args) {

		
//      java.util.function package
//		BooleanSupplier # boolean getAsBoolean
//		IntSupplier  # int getAsInt
//		LongSupplier # long getAsLong
//		DoubleSupplier # double getAsDouble
		
		AtomicInteger ints = new AtomicInteger(0);

		Supplier<Integer> supplier1 = ints::incrementAndGet;
		Stream.generate(supplier1).limit(10).forEach(System.out::println);

		//

		IntSupplier intSupplier = ints::incrementAndGet;
		IntStream.generate(intSupplier).limit(10).forEach(System.out::println);
		//
		// IntStream and the generate() method takes an IntSupplier, there is no
		// implicit boxing and unboxing; hence this code performs faster as it
		// does not generate unnecessary temporary Integer objects.
	}
}

// The primitive versions of the functional interfaces are available only for
// int, long, and double (and boolean type in addition to these three types for
// Supplier). What if you need a functional interface that takes or returns
// other primitive types char,
// byte, or short? You have to use implicit conversions to relevant int
// specializations. Similarly, when you can use specialization for double type
// when you are using float.
