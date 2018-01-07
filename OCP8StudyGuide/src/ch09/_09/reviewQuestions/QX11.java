package ch09._09.reviewQuestions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class QX11 {

	public static void main(String[] args) throws IOException {

		Path path1 = Paths.get("./goat.txt").normalize();
		Path path2 = Paths.get("mule.png");

		Files.copy(path1, path2, StandardCopyOption.COPY_ATTRIBUTES);
		System.out.println(Files.isSameFile(path1, path2));

		// isSameFile()returns true only if the files pointed to in the file
		// system are the same, without regard to the file contents.
	}
}
