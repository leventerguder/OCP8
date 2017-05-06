package _03.filter;

import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterNull {

	public static void main(String[] args) {
		Stream<String> language = Stream.of("java", "python", "node", null, "ruby", null, "php");

		// language.filter(s -> s !=
		// null).collect(Collectors.toList()).forEach(System.out::println);
		language.filter(s -> s != null).forEach(System.out::println);

		//
		System.out.println();

		// public static boolean nonNull(Object obj) {
		// return obj != null;
		// }

		Predicate<String> p = Objects::nonNull;
		
		Stream<String> language2 = Stream.of("java", "python", "node", null, "ruby", null, "php");

		language2.filter(p).collect(Collectors.toList()).forEach(System.out::println);
		//language2.filter(Objects::nonNull).collect(Collectors.toList()).forEach(System.out::println);
	}
}
