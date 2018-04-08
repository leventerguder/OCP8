package chapter06._08_questions;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Q5 {

	public static void main(String[] args) {
		//
		Stream<String> words = Pattern.compile(" ").splitAsStream("a bb ccc");

		// System.out.println(words.map(word -> word.length()).sum());
		// A. Compiler error: Cannot find symbol “sum” in interface
		// Stream<Integer>
		
		System.out.println(words.mapToInt(word -> word.length()).sum());
		
	}
}
