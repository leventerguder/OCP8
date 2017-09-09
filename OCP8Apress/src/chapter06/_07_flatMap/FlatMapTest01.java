package chapter06._07_flatMap;

import java.util.Arrays;

public class FlatMapTest01 {

	public static void main(String[] args) {
		String[] string = "you never know what you have until you clean your room".split(" ");
		// What if we want to find distinct (unique) characters in the sentence?
		// How about this code, does it work?
		Arrays.stream(string).map(word -> word.split("")).distinct().forEach(System.out::println);

		// Why? Because the word.split() returns a String[] and distinct()
		// removes duplicate references. Since the elements in the stream are of
		// type String[], the forEach() prints calls the default toString()
		// implementation that prints something that is not human-readable.
		
		Arrays.stream(string).distinct().forEach(System.out::println);
		//
		Arrays.stream(string).flatMap(word -> Arrays.stream(word.split(""))).distinct().forEach(System.out::print);
	}
}
