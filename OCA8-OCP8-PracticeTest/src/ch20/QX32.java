package ch20;

import java.util.concurrent.*;
import java.util.stream.*;

public class QX32 {

	static BlockingDeque<Integer> queue = new LinkedBlockingDeque<>();

	public static void main(String[] args) {

		
		// C. The code does not compile.
//		IntStream.iterate(1, i -> i + 1).limit(5).parallel()
//				.forEach(s -> queue.offerLast(s, 10000, TimeUnit.MILLISECONDS));
//
//		IntStream.iterate(1, i -> 5).limit(10).parallel().forEach(s -> queue.pollFirst(10, TimeUnit.SECONDS));
	}
}
