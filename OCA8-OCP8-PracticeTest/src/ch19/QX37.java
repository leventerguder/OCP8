package ch19;

import java.nio.file.Files;
import java.nio.file.Path;

public class QX37 {

	public void jenniferReads(Path p) {
		// Files.lines(p); //compile error
		// Unhandled exception type IOException
	}

	public void jonReads(Path p) {
		// Files.readAllLines(p); // compile error
		// Unhandled exception type IOException
	}
}
