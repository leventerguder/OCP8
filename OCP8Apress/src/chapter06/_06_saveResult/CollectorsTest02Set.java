package chapter06._06_saveResult;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsTest02Set {

	public static void main(String[] args) {
		//
		String[] roseQuote = "a rose is a rose is a rose".split(" ");
		Set<String> words = Arrays.stream(roseQuote).collect(Collectors.toSet());
		
		System.out.println(words);
		System.out.println(words.getClass());
	}
}
