package chapter07._01_exception;

import java.util.Scanner;

public class ReleasingResourcesTest01 {

	public static void main(String[] args) {
		// how do you know which classes need to be closed? The answer is that
		// if a class implements java.io.Closeable, then you must call the
		// close()

		// The Garbage Collector (GC) is responsible for releasing only memory
		// resources. If you are using any class that acquires system resources,
		// it is your responsibility to release them by calling the close()
		// method on that object.

		System.out.println("Type an integer in the console: ");
		Scanner consoleScanner = new Scanner(System.in);
		try {
			System.out.println("You typed the integer value: " + consoleScanner.nextInt());
		} catch (Exception e) {
			// call all other exceptions here ...
			System.out.println("Error: Encountered an exception and could not read an integer from the console... ");
			System.out.println("Exiting the program - restart and try the program again!");
		} finally {
			System.out.println("Done reading the integer... closing the Scanner");
			consoleScanner.close();
		}
	}
}
