package ch14;

import java.util.function.IntSupplier;

public class QX22 {

	public static void main(String[] args) {

		IntSupplier is = () -> {
			return 1 / 0;
		};
	}
}

// 22. Which expression is compatible with the IntSupplier functional interface?
// A. () -> 1<10 ? "3" : 4 (-)
// B. () -> {return 1/0;} (+)
// C. () -> return 4 (-)
// D. System.out::print (-)