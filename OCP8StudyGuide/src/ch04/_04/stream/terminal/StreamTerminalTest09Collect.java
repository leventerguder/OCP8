package ch04._04.stream.terminal;

import java.util.TreeSet;
import java.util.stream.Stream;

public class StreamTerminalTest09Collect {

	public static void main(String[] args) {
		//
		Stream<String> stream = Stream.of("w", "o", "l", "f");
		StringBuilder word = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
		System.out.println(word);
		//
		Stream<String> stream2 = Stream.of("w", "o", "l", "f");
		TreeSet<String> set = stream2.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
		System.out.println(set); // [f, l, o, w]
	}
}
