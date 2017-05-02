package _01.stream;

import java.util.stream.Stream;

public class StreamGenerate {

	public static void main(String[] args) {
		
		String str = "Hello World!";
		Stream<String> stream = Stream.generate(str::toString).limit(5);

		stream.forEach(s -> System.out.println(s));
		
		
	}
}
