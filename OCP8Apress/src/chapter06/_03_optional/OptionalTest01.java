package chapter06._03_optional;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.stream.Stream;

public class OptionalTest01 {

	public static void main(String[] args) {
		// Optional<T> max(Comparator<? super T> comparator);
		// int compare(T o1, T o2);
		BiFunction<Double, Double, Integer> f1 = Double::compareTo;

		Comparator<Double> comparator1 = Double::compareTo;
		Comparator<Double> comparator2 = (Double d, Double d2) -> d.compareTo(d2);

		Optional<Double> optional = Stream.of(24.5, 23.6, 27.9, 21.1, 23.5, 25.5, 28.3).max(Double::compareTo);
		// Stream.of(24.5, 23.6, 27.9, 21.1, 23.5, 25.5,
		// 28.3).max(Double::compareTo);
		
		System.out.println(optional.isPresent());
		optional.ifPresent(System.out::println);

	}
}
