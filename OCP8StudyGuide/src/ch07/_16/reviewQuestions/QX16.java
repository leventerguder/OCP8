package ch07._16.reviewQuestions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.DoubleStream;

public class QX16 {

	public static void main(String[] args) {

		ExecutorService service = Executors.newScheduledThreadPool(10);
		DoubleStream.of(3.14159, 2.71828) // b1
				.forEach(c -> service.submit(() -> System.out.println(10 * c)));
		service.execute(() -> System.out.println("Printed")); // b4
	}
}

// F. It compiles but the output cannot be determined ahead of time.