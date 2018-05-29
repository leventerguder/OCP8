package ch23;

import java.util.Comparator;
import java.util.stream.Stream;

public class Q6 {

}

class Accountant {

	class AddingException extends Exception {
	};

	class DividingException extends Exception {
	};

	class UnexpectedException extends RuntimeException {
	};

//	public void doTaxes() throws Throwable {
//		try {
//			throw new IllegalStateException();
//		} catch (AddingException | DividingException e) { //compile error
//			// Unreachable catch block for Accountant.DividingException. This exception is never thrown from the try statement body
//		} catch(UnexpectedException | Exception f ){ //compile error
//			throw f;
//			//The exception Accountant.UnexpectedException is already caught by the alternative Exception
//		}
//
//	}
	// F. The code does not compile due to lines p1 and p2.
}