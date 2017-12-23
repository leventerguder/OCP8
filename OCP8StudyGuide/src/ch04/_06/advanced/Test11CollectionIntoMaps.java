package ch04._06.advanced;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test11CollectionIntoMaps {

	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("lions", "tigers", "bears");
		//Map<String, Integer> map = s1.collect(Collectors.toMap(s -> s, String::length));
		//
		Map<String, Integer> map = s1.collect(Collectors.toMap(Function.identity(), String::length));

		System.out.println(map);
		System.out.println(map.getClass());
	}
}
