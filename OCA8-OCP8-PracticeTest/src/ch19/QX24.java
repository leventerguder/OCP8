package ch19;

import java.io.*;
import java.nio.file.*;

public class QX24 {

	public void printNotes() {
		try (OutputStream out = System.out) {
			// Files.copy(out, Paths.get("course.txt"));// compile error
			// issue. On the other hand, the Files.copy() does not compile
			// because there is no overloaded version of Files.copy() that takes
			// an OutputStream as the first parameter.
			Files.copy(Paths.get("course.txt"), out);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
