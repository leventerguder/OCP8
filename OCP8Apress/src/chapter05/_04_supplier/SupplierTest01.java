package chapter05._04_supplier;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierTest01 {

	public static void main(String[] args) {
		Random random = new Random();

		Supplier<Boolean> s1 = random::nextBoolean;
		Stream.generate(s1).limit(5).forEach(System.out::println);
	}
}

// static<T> Stream<T> generate(Supplier<T> s)
// public interface Supplier<T> {
// T get();
// }

// A Supplier<T> “supplies” takes nothing but returns something: it has no
// arguments and returns an object (of generic type T). You can call get()
// method on a Supplier object.