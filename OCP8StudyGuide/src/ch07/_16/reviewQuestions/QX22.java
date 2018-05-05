package ch07._16.reviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class QX22 {

	static int counter = 0;

	public static void main(String[] args) {

		ExecutorService service = Executors.newSingleThreadExecutor();
		List<Future<?>> results = new ArrayList<>();
		//compiler error
//		IntStream.iterate(0, i -> i + 1).limit(5).forEach(i -> results.add(service.execute(() -> counter++)));
//
//		for (Future<?> result : results) {
//			System.out.print(result.get() + " "); // n2
//		}
//		service.shutdown();
		
		IntStream.iterate(0, i->i+1).limit(5).forEach(System.out::println);
	}
}
