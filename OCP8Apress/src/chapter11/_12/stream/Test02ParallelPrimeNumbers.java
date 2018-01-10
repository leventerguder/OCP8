package chapter11._12.stream;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.LongStream;

class Test02ParallelPrimeNumbers {
	private static boolean isPrime(long val) {
		for (long i = 2; i <= val / 2; i++) {
			if ((val % i) == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Instant start = Instant.now();
		long numOfPrimes = LongStream.rangeClosed(2, 100_000).filter(Test02ParallelPrimeNumbers::isPrime).count();
		Instant end = Instant.now();
		System.out.println(Duration.between(start, end));
		//
		Instant startP = Instant.now();
		long numOfPrimesParallel = LongStream.rangeClosed(2, 100_000).parallel().filter(Test02ParallelPrimeNumbers::isPrime).count();
		Instant endP = Instant.now();
		//
		System.out.println(Duration.between(startP, endP));
		//
		System.out.println(numOfPrimes);
		System.out.println(numOfPrimesParallel);
	}
}