package ch07._04.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test01Callable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService service = Executors.newSingleThreadExecutor();

		Runnable r1 = () -> {
			System.out.println("Runnable!");
		};

		Callable<Integer> c1 = () -> {
			System.out.println("Callable!");
			return 1;
		};
		//
		Future<?> f1 = service.submit(r1);
		Future<Integer> f2 = service.submit(c1);
		//
		System.out.println(f1.get());
		System.out.println(f2.get());
	}
}
