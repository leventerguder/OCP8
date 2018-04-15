package mock;

import java.util.Optional;
import java.util.function.Consumer;

class NullableBook {
	Optional<String> bookName;

	public NullableBook(Optional<String> name) {
		bookName = name;
	}

	public Optional<String> getName() {
		return bookName;
	}
}

public class QX72 {

	public static void main(String[] args) {

		NullableBook nullBook = new NullableBook(Optional.ofNullable(null));
		Optional<String> name = nullBook.getName();
		// public void ifPresent(Consumer<? super T> consumer)
		// name.ifPresent(System.out::println).orElse("Empty"); // compile error
	}
}
