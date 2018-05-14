package ch15;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QX36 {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("");
		Function<String, Integer> f1 = (str) -> str.length();
		
	}
}

// When working with a Stream<String>, which of these types can be returned from
// the collect() terminal operator by passing arguments to
// Collectors.groupingBy()?