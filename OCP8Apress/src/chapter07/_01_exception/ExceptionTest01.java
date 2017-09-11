package chapter07._01_exception;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionTest01 {

	public static void main(String[] args) {
		//String integerStr = ""; // NoSuchElementException
		String integerStr = "InputMismatchException"; // InputMismatchException
		System.out.println("The string to scan integer from it is: " + integerStr);
		Scanner consoleScanner = new Scanner(integerStr);
		try {
			System.out.println("The integer value scanned from string is: " + consoleScanner.nextInt());
		} catch (InputMismatchException ime) {
			// InputMismatchException extends NoSuchElementException
			System.out.println("Error: Cannot scan an integer from the given string : InputMismatchException");
		} catch (NoSuchElementException nsee) {
			System.out.println("Error: Cannot scan an integer from the given string : NoSuchElementException");
		} catch (IllegalStateException ise) {
			System.out.println("Error: nextInt() called on a closed Scanner object");
		}
	}
}
