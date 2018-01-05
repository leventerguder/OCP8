package chapter10._03.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesTest07GetX {

	public static void main(String[] args) throws IOException {
		Path p1 = Paths.get("lastModified.txt");

		if (!Files.exists(p1)) {
			Files.createFile(p1);
		}

		System.out.println(Files.getLastModifiedTime(p1));
		System.out.println(Files.getFileStore(p1));
		System.out.println(Files.getOwner(p1));

	}
}
