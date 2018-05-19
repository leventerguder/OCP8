package ch18;

import java.io.Console;

public class QX24 {

	public static void main(String[] args) {

		Console c = System.console();
		final String response = c.readLine("Are you human?");
		System.err.print(response);
	}
}

// I. The program may ask the user a question and print the response to the
// error stream.
// II. The program may throw a NullPointerException at runtime.
// III. The program may wait indefinitely.

// D. I, II, and III