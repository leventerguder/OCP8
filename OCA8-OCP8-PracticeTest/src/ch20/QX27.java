package ch20;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class QX27 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService x = Executors.newSingleThreadExecutor();
		Future<?> f1 = x.submit(() -> Accountant.completePaperwork());
		Future<Object> f2 = x.submit(() -> Accountant.getPi());
		System.out.print(f1.get() + " " + f2.get());
		x.shutdown();
		//[Filing]null 3.14159
	}

}

class Accountant {

	public static void completePaperwork() {
		System.out.print("[Filing]");
	}

	public static double getPi() {
		return 3.14159;
	}
}