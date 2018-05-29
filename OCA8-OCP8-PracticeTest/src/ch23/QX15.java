package ch23;

import java.util.function.IntUnaryOperator;

public class QX15 {

	public static void main(String[] args) {

		IntUnaryOperator iu = v -> {
			System.out.print("Hello!");
			return 2 % 1;
		};

		IntUnaryOperator iu2 = (int j) -> (int) 30L;

		IntUnaryOperator iu3 = z -> z;
	}
}
// Which of the following lambda expressions can be passed to a method that
// takes IntUnaryOperator as an argument? (Choose three.)

// A. v -> {System.out.print("Hello!"); return 2%1;}
// B. (Integer w) -> w.intValue()
// C. (int j) -> (int)30L
// D. (int q) -> q/3.1
// E. (long x) -> (int)x
// F. z -> z
