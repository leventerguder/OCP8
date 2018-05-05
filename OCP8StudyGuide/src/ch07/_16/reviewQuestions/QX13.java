package ch07._16.reviewQuestions;

import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QX13 {

	public static void main(String[] args) {

		Stream<String> cats = Stream.of("leopard", "lynx", "ocelot", "puma").parallel();
		Stream<String> bears = Stream.of("panda", "grizzly", "polar").parallel();
		//
		// the stream created by flatMap() is a new stream that is not
		// parallel by default
		ConcurrentMap<Boolean, List<String>> data = Stream.of(cats, bears).flatMap(s -> s)
				.collect(Collectors.groupingByConcurrent(s -> !s.startsWith("p")));

		System.out.println(data.get(false).size() + " " + data.get(true).size());
		// It outputs 3 4.
	}
}
