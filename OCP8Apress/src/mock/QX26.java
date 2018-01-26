package mock;

import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

public class QX26 {

	public static void main(String[] args) {

		IntFunction<UnaryOperator<Integer>> func = i -> j -> i * j;
		Integer apply = func.apply(10).apply(20);
		System.out.println(apply);
	}
}
