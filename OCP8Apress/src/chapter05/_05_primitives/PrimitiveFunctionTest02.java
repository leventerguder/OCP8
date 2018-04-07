package chapter05._05_primitives;

import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class PrimitiveFunctionTest02 {

	public static void main(String[] args) {
		// IntFunction<R>    ---> R apply(int value)
		// LongFunction<R>   ---> R apply(long value)
		// DoubleFunction<R> ---> R apply(double value)
		
		// IntFunction<String> f1 = (Integer i) -> i + ""; // Lambda
		// expression's parameter i is expected to be of type int
		IntFunction<String> f1 = (int i) -> i + " ";

		//
		// ToIntFunction<T> ---> int applyAsInt(T value)
		// ToLongFunction<T> ---> long applyAsLong(T value)
		// ToDoubleFunction<T> ---> double applyAsDouble(T value)

		ToLongFunction<String> f2 = (String value) -> Long.parseLong(value);

		// IntToLongFunction ---> long applyAsLong(int value)
		// IntToDoubleFunction ---> double applyAsDouble(int value)
		//
		// LongToIntFunction ---> int applyAsInt(long value)
		// LongToDoubleFunction ---> double applyAsDouble(long value)
		//
		// DoubleToIntFunction ---> int applyAsInt(double value)
		// DoubleToLongFunction ---> long applyAsLong(double value)

		IntToLongFunction f3 = (int i) -> new Long(i * i);
	}
}
