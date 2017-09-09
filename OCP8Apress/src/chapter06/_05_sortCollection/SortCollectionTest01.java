package chapter06._05_sortCollection;

import java.util.Arrays;
import java.util.List;

public class SortCollectionTest01 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("follow your heart but take your brain with you".split(" "));
		words.stream().distinct().sorted().forEach(System.out::println);

		Arrays.asList().stream().sorted().forEach(System.out::println); // no error																	
		
		Arrays.asList(new Animal()).stream().sorted().forEach(System.out::println); // no error

		//Arrays.asList(new Animal(), new Animal(), new Animal()).stream().sorted().forEach(System.out::println);
		//java.lang.ClassCastException: chapter06._05_sortCollection.Animal cannot be cast to java.lang.Comparable
	}

}

class Animal {
}
