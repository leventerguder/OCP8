package chapter06._07_flatMap;

import java.util.Arrays;
import java.util.List;

public class FlatMapTest02 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.stream().map(i -> i * i).forEach(System.out::println);

		//
		List<Integer[]> listArray = Arrays.asList(new Integer[] { 1, 2, 3 }, new Integer[] { 4, 5 });
		//listArray.stream().map(i -> i * i).forEach(System.out::println); // compiler error 
		listArray.stream().flatMap( array -> Arrays.stream(array) ).map(i->i*i).forEach(System.out::println);
	}
}
