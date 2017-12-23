package ch04._04.stream.creating;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamSourceTest01 {

	public static void main(String[] args) {
		Stream<String> s0 = Stream.empty();
		Stream<Integer> s1 = Stream.of(1, 2, 3);
		//
		List<String> list = Arrays.asList("a", "b", "c");
		Stream<String> s2 = list.stream();
		Stream<String> s3 = list.parallelStream();
	}

}
