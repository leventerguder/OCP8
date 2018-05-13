package ch15;

import java.util.Set;
import java.util.stream.Stream;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;

public class QX19 {

	public static void main(String[] args) {
		//
		Set<String> set = new HashSet<>();
		set.add("tire-");

		List<String> list = new LinkedList<>();
		Deque<String> queue = new ArrayDeque<>();
		queue.push("wheel-");
		//
		Stream.of(set, list, queue).flatMap(x -> x.stream()).forEach(System.out::print);
		// B. tire-wheel-

	}
}
