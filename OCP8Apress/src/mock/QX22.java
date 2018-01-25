package mock;

import java.util.stream.Stream;

public class QX22 {
	public static void main(String[] args) {
		Stream<String> words = Stream.of("one", "two", "three");
		int len = words.mapToInt(String::length).reduce(0, (len1, len2) -> len1 + len2);
		System.out.println(len);
	}
}