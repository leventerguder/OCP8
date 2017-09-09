package chapter06._05_sortCollection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortByLengthTest01 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("follow your heart but take your brain with you".split(" "));
		//
		Comparator<String> lengthCompare = (str1, str2) -> str1.length() - str2.length();

		words.stream().distinct().sorted(lengthCompare).forEach(System.out::println);
		System.out.println();

		words.stream().distinct().sorted(lengthCompare.thenComparing(String::compareTo)).forEach(System.out::println);

		System.out.println();
		words.stream().distinct().sorted(String::compareTo).forEach(System.out::println);

		System.out.println();
		words.stream().distinct().sorted(lengthCompare.thenComparing(String::compareTo).reversed())
				.forEach(System.out::println);
	}
}
