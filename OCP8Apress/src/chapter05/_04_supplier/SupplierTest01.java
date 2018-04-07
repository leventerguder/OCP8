package chapter05._04_supplier;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierTest01 {

	public static void main(String[] args) {
		
		Random random = new Random();

		Supplier<Boolean> supplier1 = random::nextBoolean;
		Stream.generate(supplier1).limit(5).forEach(s -> System.out.print(s + " "));

		//
		System.out.println();
		
		Supplier<Integer> supplier2 = random::nextInt;
		Stream.generate(supplier2).limit(3).forEach(s -> System.out.print(s + " "));
		
		//
	}
}

// static<T> Stream<T> generate(Supplier<T> s)
// public interface Supplier<T> {
// T get();
// }

// A Supplier<T> “supplies” takes nothing but returns something: it has no
// arguments and returns an object (of generic type T). You can call get()
// method on a Supplier object.