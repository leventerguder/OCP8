package chapter10._03.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesTest03CreateFile {

	public static void main(String[] args) throws IOException {

		Path p1 = Paths.get("createFile.txt");
		if (!Files.exists(p1))
			Files.createFile(p1);

	}
}
