package ch04._07.reviewQuestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Qx16 {

	public static void main(String[] args) {
		Stream<String> s = Stream.empty();
		Stream<String> s2 = Stream.empty();
		//
		Map<Boolean, List<String>> p = s.collect(Collectors.partitioningBy(b->b.startsWith("c")));
		Map<Boolean , List<String>> g = s2.collect(Collectors.groupingBy(b->b.startsWith("c")));
		
		System.out.println(p + " " + g);
	}
}
