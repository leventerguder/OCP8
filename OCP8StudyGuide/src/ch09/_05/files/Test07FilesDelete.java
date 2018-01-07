package ch09._05.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test07FilesDelete {

	public static void main(String[] args) throws IOException {

		Path path1 = Paths.get("deleteMe.txt");
		if (!Files.exists(path1)) {
			Files.createFile(path1);
		}

		// it throws a NoSuchFileException if the le or directory does not
		// exist.
		Files.delete(path1); // deleted

		System.out.println(Files.deleteIfExists(path1));

	}
}
