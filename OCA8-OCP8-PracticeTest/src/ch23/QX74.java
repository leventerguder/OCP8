package ch23;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QX74 {

	public static void main(String[] args) {

		ExecutorService e = Executors.newSingleThreadExecutor();
		Runnable r1 = () -> Stream.of(1, 2, 3).parallel();
		Callable r2 = () -> Stream.of(4, 5, 6).parallel();

		// Future<Stream> f1 = e.submit(r1); //compile error !
		Future<?> f1 = e.submit(r1);
		Future<Stream> f2 = e.submit(r2);

		//Stream<Integer> s = Stream.of(f1.get(),f2.get()) .flatMap(p -> p) //compile error 
		//.parallelStream();//compile error
		
//		ConcurrentMap<Boolean,List<Integer>> r = s.collect(Collectors.groupingByConcurrent(i -> i%2==0));
//		System.out.println(r.get(false).size()+" "+r.get(true).size());
	}
}
