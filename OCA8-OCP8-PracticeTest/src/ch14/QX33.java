package ch14;

import java.util.function.DoubleToLongFunction;

public class QX33 {
	DoubleToLongFunction df1 = a -> null == null ? 1 : 2L;
	DoubleToLongFunction df2 = e -> (int) (10.0 * e);
	DoubleToLongFunction df3 = (double m) -> {long p = (long)m; return p;};
	// DoubleToLongFunction df4 = (Double s) -> s.longValue(); // Lambda expression's parameter s is expected to be of type double
}

// Which lambda expression cannot be assigned to a DoubleToLongFunction
// functional
// interface?
// A. a -> null==null ? 1 : 2L
// B. e -> (int)(10.0*e)
// C. (double m) -> {long p = (long)m; return p;}
// D. (Double s) -> s.longValue()