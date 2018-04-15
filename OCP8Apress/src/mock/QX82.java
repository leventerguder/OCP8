package mock;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QX82 {

	public static void main(String[] args) {

		Stream<String> words = Stream.of("eeny", "meeny", "miny", "mo");
		String boxedString = words.collect(Collectors.joining(", ", "[", "]"));
		System.out.println(boxedString);
	}
}
