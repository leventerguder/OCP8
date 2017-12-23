package ch04._06.advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test01LinkingStreamWithList {

	public static void main(String[] args) {
		List<String> cats = new ArrayList<>();
		cats.add("Annie");
		cats.add("Ripley");
		//
		Stream<String> stream = cats.stream();

		cats.add("KC");

		System.out.println(stream.count());
		//3
		//remember that streams are lazily evaluated.
		//the stream pipeline actually runs/ the stream pipeline run first, looking at the source and seeing three elements.
	}
}
