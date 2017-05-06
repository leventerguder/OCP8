package _07.reuse.stream;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReuseStream {

	public static void main(String[] args) {
		String[] array = { "a", "b", "c", "d", "e" };

		Stream<String> stream = Arrays.stream(array);

		stream.forEach(System.out::println);

		// java.lang.IllegalStateException: stream has already been operated
		// upon
		// or closed
		// long count = stream.count();

		// you can use Supplier

		Supplier<Stream<String>> streamSupplier = () -> Stream.of(array);
		//
		streamSupplier.get().forEach(System.out::println);
		long count = streamSupplier.get().count();
		System.out.println(count);
	}
}
