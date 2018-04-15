package mock;

import java.time.LocalDate;
import java.util.function.Supplier;

public class QX57 {

	public static void main(String[] args) {
		// Supplier<LocalDate> now1 = LocalDate::now(); // compile error
		//Supplier<LocalDate> now2 = () -> LocalDate::now; // compile error
		//String now3 = LocalDate::now::toString;
		Supplier<LocalDate> now4 = LocalDate::now;
	}
}
