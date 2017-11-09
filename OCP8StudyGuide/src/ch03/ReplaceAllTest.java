package ch03;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class ReplaceAllTest {

	public static void main(String[] args) {
		// void replaceAll(UnaryOperator<E> o)
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		UnaryOperator<Integer> unary = x -> x * 2;
		list.replaceAll(unary);
		// public interface UnaryOperator<T> extends Function<T, T> {
		System.out.println(list);
	}
}
