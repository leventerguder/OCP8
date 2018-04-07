package chapter04.stream;

import java.util.stream.Stream;

public class Test06StreamCount {

	public static void main(String[] args) {
		long count = Stream.of(1, 2, 3, 4, 5).count();
		System.out.println(count);
		
		//
	}
}
