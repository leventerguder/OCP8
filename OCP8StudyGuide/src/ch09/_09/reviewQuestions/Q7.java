package ch09._09.reviewQuestions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q7 {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("turkey");
		if (Files.isSameFile(path, Paths.get("/zoo/turkey"))) // x1
			Files.createDirectory(path.resolve("info")); // x2

		// java.nio.file.NoSuchFileException: turkey
	}
}
