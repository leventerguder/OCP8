package chapter06._06_saveResult;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsTest03Map {

	public static void main(String[] args) {
		Map<String, Integer> map = Stream.of("Arnold", "Alois", "Schwarzenegger")
				//.collect(Collectors.toMap(name -> name, name -> name.length()));
				.collect(Collectors.toMap(Function.identity(), name -> name.length()));
		//
		map.forEach((name, len) -> System.out.println(name + " " + len));
	}
}
