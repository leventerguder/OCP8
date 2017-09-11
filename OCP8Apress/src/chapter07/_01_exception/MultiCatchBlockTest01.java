package chapter07._01_exception;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class MultiCatchBlockTest01 {

	public static void main(String[] args) {
		String integerStr = "";
		System.out.println("The string to scan integer from it is: " + integerStr);
		Scanner consoleScanner = new Scanner(integerStr);
		try {
			System.out.println("The integer value scanned from string is: " + consoleScanner.nextInt());
		} catch (NoSuchElementException | IllegalStateException multie) {
			System.out.println("Error: An error occured while attempting to scan the integer");
		}

		// In a multi-catch block, you cannot combine catch handlers for two
		// exceptions that share a base- and derived-class relationship. You can
		// only combine catch handlers for exceptions that do not share the
		// parent-child relationship between them.
	}
}
