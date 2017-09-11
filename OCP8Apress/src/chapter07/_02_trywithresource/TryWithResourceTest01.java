package chapter07._02_trywithresource;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResourceTest01 {

	public static void main(String[] args) {
		try (Scanner consoleScanner = new Scanner(System.in)) {
			System.out.println(consoleScanner.nextInt());
		}

		try (FileReader fr = new FileReader("test.txt"); FileWriter fw = new FileWriter("test.txt");) {
			// You can use more than one resource in a try-with-resources
			// statement.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// . If the resource is explicitly closed in the try block, then calling
		// close() again does not have any effect.
}
