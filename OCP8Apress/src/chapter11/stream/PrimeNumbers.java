package chapter11.stream;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.LongStream;

class PrimeNumbers {
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
		long numOfPrimes = LongStream.rangeClosed(2, 100_000).filter(PrimeNumbers::isPrime).count();
		Instant end = Instant.now();
		System.out.println(Duration.between(start, end).getSeconds());
		System.out.println(Duration.between(start, end).getNano());

		//
		Instant startP = Instant.now();
		long numOfPrimesParallel = LongStream.rangeClosed(2, 100_000).parallel().filter(PrimeNumbers::isPrime).count();
		Instant endP = Instant.now();

		//
		System.out.println(Duration.between(startP, endP).getSeconds());
		System.out.println(Duration.between(startP, endP).getNano());

		//
		System.out.println(numOfPrimes);
		System.out.println(numOfPrimesParallel);
	}
}