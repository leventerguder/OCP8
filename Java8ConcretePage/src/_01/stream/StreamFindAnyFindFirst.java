package _01.stream;

import java.util.Arrays;
import java.util.List;

public class StreamFindAnyFindFirst {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("H", "E", "B", "E", "L", "E");
		String any = list.stream().findAny().get();

		// In a non-parallel operation, it will most likely return the first
		// element in the Stream but there is no guarantee for this.
		// http://www.baeldung.com/java-stream-findfirst-vs-findany
		System.out.println(any);

		String first = list.stream().findFirst().get();
		System.out.println(first);
	}
}
