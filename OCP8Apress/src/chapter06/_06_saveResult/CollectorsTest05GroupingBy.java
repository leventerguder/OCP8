package chapter06._06_saveResult;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsTest05GroupingBy {

	public static void main(String[] args) {
		//
		String[] sentence = "you never know what you have until you clean your room".split(" ");
		Stream<String> words = Arrays.stream(sentence).distinct();
		//
		Map<Integer, List<String>> wordGroup = words.collect(Collectors.groupingBy(String::length));

		System.out.println(wordGroup);
		//
		wordGroup.forEach((count, word) -> {
			System.out.println("length:" + count);
			word.forEach(System.out::println);

		});
	}
}
