package ch09._08.stream;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test04FilesLines {

	public static void main(String[] args) throws IOException {

		Path f1 = Paths.get("lines.txt");

		BufferedWriter bw = Files.newBufferedWriter(f1);
		bw.write("line1\nline2\nline3\nline4");
		bw.close();

		Files.lines(f1).forEach(System.out::println);

	}
}
// Files.readAllLines() and commented that using it to read a very
// large le could result in an OutOfMemoryError problem.

// Files.lines(Path) method that returns a Stream<String> object and does not
// suffer from this same issue.