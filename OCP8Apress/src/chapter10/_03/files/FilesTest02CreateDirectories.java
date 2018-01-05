package chapter10._03.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesTest02CreateDirectories {

	public static void main(String[] args) throws IOException {
		
		Path p1 = Paths.get("folder1/folder2");
		if (!Files.exists(p1))
			Files.createDirectories(p1);

	}
}
