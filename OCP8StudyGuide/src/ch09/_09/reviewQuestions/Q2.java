package ch09._09.reviewQuestions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q2 {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get(".");
		if (Files.isDirectory(path))
			System.out.println(Files.deleteIfExists(path) ? "Success" : "Try Again");
	}
}

// path refers to a symbolic link in the file system
// path refers to an empty directory in the file system.

// A symbolic link can point to a real directory, and by default isDirectory()
// follows links