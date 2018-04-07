package chapter07._02_trywithresource;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResourceTest01 {

	public static void main(String[] args) {

		// Java compiler will internally translate this try-with-resources block
		// into a try-finally block.
		// you can provide a try-with resouces statement without explicit catch
		// or finally blocks.
		// Note that for a resource to be usable with a try-with- resource
		// statement , the class of that resource must implement
		// java.lang.AutoClosable interface
		try (Scanner consoleScanner = new Scanner(System.in)) {
			System.out.println(consoleScanner.nextInt());
		}

		//
		//
		try (FileReader fr = new FileReader("test.txt"); FileWriter fw = new FileWriter("test.txt");) {
			// You can use more than one resource in a try-with-resources

			// fr = new FileReader("compiler errror!");
			// You cannot assign to the resource variables declared in the
			// try-with-resources within the body of the try-with-resources
			// statement
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} // If the resource is explicitly closed in the try block, then calling
		// close() again does not have any effect.
		// it is a bad practice to explicitly call the close() method inside a
		// try-with-resource statement.
}
