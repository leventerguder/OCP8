package _01.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamFilter {

	public static void main(String[] args) {
		Predicate<Integer> p = num -> num % 2 == 0;
		List<Integer> list = Arrays.asList(3, 4, 5, 6);

		// Consumer # void accept(T t)

		Consumer<Integer> consumer = (Integer i) -> System.out.print(i + " ");

		list.stream().filter(p).forEach(consumer);
		// list.stream().filter(p).forEach(e -> System.out.print(e + " "));

	}
}
