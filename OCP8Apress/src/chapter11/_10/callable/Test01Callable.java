package chapter11._10.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//implements Callable so that it can be passed to a ExecutorService and get executed as a task.
class CallableImpl implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		System.out.println(Thread.currentThread().getName());
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			sum = sum + i;
		}
		return sum;
	}

}

public class Test01Callable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Callable<Integer> task = new CallableImpl();

		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future<Integer> future = executorService.submit(task);

		while (true) {
			if (future.isDone()) {
				System.out.println(future.get());
				break;
			} else {
				System.out.println("not finished!");
			}
		}

		executorService.shutdown();

	}
}
