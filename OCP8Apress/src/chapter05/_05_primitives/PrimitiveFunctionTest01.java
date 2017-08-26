package chapter05._05_primitives;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

public class PrimitiveFunctionTest01 {

	public static void main(String[] args) {
		Function<Integer, Integer> absInt = Math::abs; // static int abs(int a)
		IntFunction<Integer> absIntPrimivite = Math::abs;

		System.out.println(absInt.apply(-10));
		System.out.println(absIntPrimivite.apply(-15));

		LongFunction<Long> longF1 = (long lo1) -> lo1 * 10;
		System.out.println(longF1.apply(10));

	}
}
