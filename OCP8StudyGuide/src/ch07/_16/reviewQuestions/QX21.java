package ch07._16.reviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class QX21 {

	public static void main(String[] args) {

		ExecutorService service = Executors.newSingleThreadExecutor();
		final List<Future<?>> results = new ArrayList<>();

		IntStream.range(0, 10).forEach(i -> results.add(service.submit(() -> CountZooAnimals.performCount(i))));

		results.stream().forEach(f -> CountZooAnimals.printResults(f));

		service.shutdown();

	}
}

class CountZooAnimals {

	public static Integer performCount(int exhibitNumber) {
		return 10;
	}

	public static void printResults(Future<?> f) {
		try {
			System.out.println(f.get());
		} catch (Exception e) {
			System.out.println("Exception!");
		}
	}

}