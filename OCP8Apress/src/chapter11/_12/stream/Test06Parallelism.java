package chapter11._12.stream;

import java.util.concurrent.ForkJoinPool;

public class Test06Parallelism {

	public static void main(String[] args) {
		// By default, the fork/join thread pool has the number of threads is
		// typically equal to the number of processors you have in your machine.
		System.out.println(ForkJoinPool.commonPool().getParallelism());
	}
}
