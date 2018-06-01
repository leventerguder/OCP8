package ch23;

import java.util.stream.IntStream;

public class QX73 {

	public static void main(String[] args) {
		
		IntStream pages = IntStream.of(200,300);
		long total = pages.sum();
		long count = pages.count(); 
		// java.lang.IllegalStateException: stream has already been operated upon or closed
		System.out.println(total + "-" + count);
	}
}
