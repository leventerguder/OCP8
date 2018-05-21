package ch19;

import java.io.*;
import java.nio.file.*;

public class QX24 {

	public void printNotes() {
		try (OutputStream out = System.out) {
			//Files.copy(out, Paths.get("course.txt"));// compile error
			Files.copy(Paths.get("course.txt"), out);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
