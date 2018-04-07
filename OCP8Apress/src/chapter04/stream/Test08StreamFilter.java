package chapter04.stream;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Test08StreamFilter {

	public static void main(String[] args) {
		IntStream.rangeClosed(0, 20).filter(i -> i % 2 == 0).forEach(System.out::println);
		
		//
		IntPredicate ip = Test08StreamFilter::isEven;
		IntConsumer is = Test08StreamFilter::isEven;
		Consumer<Integer> c = Test08StreamFilter::isEven;
		
		IntStream.rangeClosed(0, 20).filter(ip).forEach(System.out::println);
	}
	
	public static boolean isEven(int i) {
	    return (i % 2) == 0;
	}
}
