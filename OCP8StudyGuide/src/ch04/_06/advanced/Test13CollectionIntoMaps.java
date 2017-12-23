package ch04._06.advanced;

import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test13CollectionIntoMaps {

	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("lions", "tigers", "bears");

		TreeMap<Integer, String> tmap = s1.collect(
				Collectors.toMap(String::length, Function.identity(), (str1, str2) -> str1 + "," + str2, TreeMap::new));

		System.out.println(tmap);
	}
}
