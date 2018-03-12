package ch07._05.scheduledExecutorService;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Test04ScheduledExecutorService {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		// While a single-thread executor will wait for an available thread to
		// become available before running the next task, a pooled-thread
		// executor can execute the next task concurrently.
		// If the pool runs out of available threads, the task will be queued by
		// the thread executor and wait to be completed.

		// As long as our number of tasks is less than our number of threads,
		// all tasks will be executed concurrently

		//ScheduledExecutorService service = Executors.newScheduledThreadPool(4);

		ExecutorService service = Executors.newFixedThreadPool(4);
		// ScheduledExecutorService service =
		// Executors.newSingleThreadScheduledExecutor();
		Callable<String> task1 = () -> {
			System.out.println("task1 message");
			printNumbers();
			return "content1";
		};

		Callable<String> task2 = () -> {
			System.out.println("task2 message");
			printNumbers();
			return "content2";
		};

		Callable<String> task3 = () -> {
			System.out.println("task3 message");
			printNumbers();
			return "content3";
		};

		Callable<String> task4 = () -> {
			System.out.println("task4 message");
			printNumbers();
			return "content4";
		};

//		ScheduledFuture<String> result1 = service.schedule(task1, 100, TimeUnit.MILLISECONDS);
//		ScheduledFuture<String> result2 = service.schedule(task2, 100, TimeUnit.MILLISECONDS);
//		ScheduledFuture<String> result3 = service.schedule(task3, 100, TimeUnit.MILLISECONDS);
//		ScheduledFuture<String> result4 = service.schedule(task4, 100, TimeUnit.MILLISECONDS);

		Future<String> result1 = service.submit(task1);
		Future<String> result2 = service.submit(task2);
		Future<String> result3 = service.submit(task3);
		Future<String> result4 = service.submit(task4);
		
		Thread.sleep(500); // wait for finishing
		if (result1.isDone() && result2.isDone() && result3.isDone() && result4.isDone()) {
			System.out.println("shutdown...");
			service.shutdown();
		}

	}

	public static void printNumbers() {
		for (int i = 0; i < 10; i++) {
			System.out.println("i : " + i + " , " + Thread.currentThread().getName());
		}
	}
}
