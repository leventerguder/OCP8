package ch15;

import java.util.Collection;
import java.util.stream.Stream;
import java.util.List;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;

public class QX40 {

	private static void withFlatMap(Collection<?> coll) {
		Stream.of(coll).flatMap(x -> x.stream()).forEach(System.out::print);
		System.out.println();
	}

	private static void withoutFlatMap(Collection<?> coll) {
		Stream.of(coll).filter(x -> !x.isEmpty()).map(x -> x).forEach(System.out::print);
		System.out.println();
	}

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		Deque<String> queue = new ArrayDeque<>();
		queue.push("all queued up");
		queue.push("last");

		//
		withFlatMap(queue);
		withoutFlatMap(queue);
	}
}
