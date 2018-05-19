package ch18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class QX34 {

	public String getNameQuick() throws IOException {
		//
		final BufferedReader r = new BufferedReader(new FileReader("saved.name"));
		final String name = r.readLine();
		// r.flush(); //compile error
		return name;
	}

	public String getNameSafely() throws IOException {
		try (final BufferedReader r = new BufferedReader(new FileReader("saved.name"))) {
			final String name = r.readLine();
			// r.flush(); // compile error
			return name;
		}
	}

	// B. Neither method compiles.
}
