package chapter09;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class StreamTest01 {

	//
	// The standard streams are initialized when the JVM starts.
	
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream ps = new PrintStream("log.txt");
		System.setOut(ps);
		System.out.println("test output to System.out");
		ps.print("added");

	}
}
