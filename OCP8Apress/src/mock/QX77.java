package mock;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Sum implements Callable<Long> {
	
	long n;
	public Sum(long n) {
		this.n = n;
		// LINE_DEF
	}

	public Long call() throws Exception {
		long sum = 0;
		for (long longVal = 1; longVal <= n; longVal++) {
			sum += longVal;
		}
		return sum;
	}
}

public class QX77 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Callable<Long> task = new Sum(5);
		ExecutorService es = Executors.newSingleThreadExecutor();
		Future<Long> future = es.submit(task);
		System.out.printf("sum of 1 to 5 is %d", future.get());
		es.shutdown();
	}
}
