package chapter05._06_binary;

import java.util.function.BiFunction;

public class BiFunctionTest01 {

	public static void main(String[] args) {
		//
		BiFunction<String, String, String> ccat = (x, y) -> x.concat(y);
		System.out.println(ccat.apply("hello", "world"));

		BiFunction<String, String, String> ccat2 = new String()::replaceAll;

		BiFunction<Double, Double, Integer> compares = Double::compareTo;
		BiFunction<Double, Double, Integer> compares2 = Double::compare;

		System.out.println(compares.apply(10.5, 2.5));
		System.out.println(compares2.apply(10.5, 2.5));

		//burada kendi tipinde parametre aliyorsa metot , bu durumda bu sekilde kullanabiliyoruz. ilginc.
		//bu metot static olmasina gerek yok.
		BiFunction<BiFunctionTest01, BiFunctionTest01, Integer> testCompare = BiFunctionTest01::compareTo;
		
		BiFunction<Double,Double,Integer> bif1 = new BiFunctionTest01()::testMethod;
	}

	private final double value = 1;

	public int compareTo(BiFunctionTest01 anotherDouble) {
		return Double.compare(value, 1);
	}

	public int testMethod(Double a, Double b) {
		return Double.compare(value, 1);
	}
}

// public interface Function<T,R>{
// R apply(T t);
// }
//
// public interface BiFunction<T,U,R>{
// R apply(T,U)
// }

/*
 * A BiFunction is similar to Function, but the difference is that it takes two
 * arguments: it takes arguments of generic types T and U and returns an object
 * of generic type R. You can call apply() method on a BiFunction object.s
 */
