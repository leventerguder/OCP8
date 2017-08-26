package chapter05._02_consumer;

import java.util.stream.Stream;

public class ConsumerTest01 {

	public static void main(String[] args) {
		Stream.of("hello", "world", "injavawetrust").forEach(System.out::println);
	}
}

// public interface Consumer<T> {
// void accept(T t );
// }

// A Consumer<T> “consumes” something: it takes an argument (of generic type T)
// and returns nothing (void). You can call accept() method on a Consumer
// object.