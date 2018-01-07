package ch09._08.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test03FilesList {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get(".");
		Files.list(path).forEach(System.out::println);

		// Contrast this method with the Files.walk() method, which traverses
		// all subdirectories.

		// Files.list() searches one level deep
	}
}
