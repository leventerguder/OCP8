package ch09._05.files;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Test10FilesReadAllLines {

	public static void main(String[] args) throws IOException {
		Path f1 = Paths.get("readAllLines.txt");

		try (BufferedWriter bw = Files.newBufferedWriter(f1)) {
			bw.write("line1\nline2\nline3\nline4");
		}

		List<String> allLines = Files.readAllLines(f1);
		allLines.forEach(System.out::println);
	}
}
// Files.readAllLines(path) method read all of the lines of a text file and
// returns the results as an ordered List of String values.

// if the file is significantly large you may encounter an OutOfMemoryError
// trying to load all of it into memory.