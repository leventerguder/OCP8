package chapter11.stream;

import java.util.concurrent.ForkJoinPool;

public class Parallelism {

	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println(ForkJoinPool.commonPool().getParallelism());
	}
}
