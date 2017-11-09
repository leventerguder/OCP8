package ch03;

import java.util.Arrays;
import java.util.List;

public class ForEachTest {

	public static void main(String[] args) {
		List<String> cats = Arrays.asList("Annie", "Ripley");
		cats.forEach(System.out::println);
	}
}
