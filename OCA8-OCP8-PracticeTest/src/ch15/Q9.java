package ch15;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q9 {

	public static void main(String[] args) {
		
		Stream<Character> chars = Stream.of('o', 'b', 's', 't', 'a', 'c', 'l', 'e');
		
		chars.map(c->c).collect(Collectors.toList());
	}
}
