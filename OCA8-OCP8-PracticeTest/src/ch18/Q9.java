package ch18;

import java.io.*;

public class Q9 {

	// Assume the file prime6.txt exists and contains the first six prime
	// numbers as bytes: 2, 3, 5, 7, 11, 13. What is the output of the following
	// application?

	public static void main(String[] args) throws Exception {
		try (InputStream is = new FileInputStream("prime6.txt")) {
			is.skip(1);
			is.read();
			is.skip(1);
			is.read();
			is.mark(4);
			is.skip(1);
			is.reset();
			System.out.print(is.read());
		}
	}
}

// The code compiles but throws an exception at runtime.
