package ch13._08.reviewQuestions;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class QX13 {

	public static void main(String[] args) throws IOException {

		// What are the possible results of executing the following code?
		// (Choose all that apply.)
		// A. It compiles and runs without issue.
		// E. It compiles but throws an IOException at runtime.
		Path path = Paths.get("turtle.txt");
		try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)) {
			for (Path entry : directoryStream)
				System.out.println(entry.getFileName());
		}
	}
}
