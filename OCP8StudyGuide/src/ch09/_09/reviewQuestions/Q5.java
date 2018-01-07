package ch09._09.reviewQuestions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q5 {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("/kang");
		if (Files.isDirectory(path) && Files.isSymbolicLink(path))
			Files.createDirectory(path.resolve("joey"));
	}
}
//
// B. A new directory will be created only if /mammal/kangaroo exists.
// C. If the code creates a directory, it will be reachable at /kang/joey.
// D. If the code creates a directory, it will be reachable at /mammal/kangaroo/joey.