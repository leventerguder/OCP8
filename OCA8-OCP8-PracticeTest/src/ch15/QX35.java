package ch15;

import java.util.Set;
import java.util.stream.Stream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class QX35 {

	public static void main(String[] args) {
		//
		Set<String> set = new HashSet<>();
		set.add("tire-");

		List<String> list = new LinkedList<>();
		Deque<String> queue = new ArrayDeque<>();
		queue.push("wheel-");

		// Stream.of(set, list, queue) .flatMap(x -> x)
		// .forEach(System.out::print); //compile error x->x

		Stream.of(set, list, queue).flatMap(x -> x.stream()).forEach(System.out::print);
	}
}
