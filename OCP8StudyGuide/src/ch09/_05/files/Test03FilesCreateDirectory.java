package ch09._05.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test03FilesCreateDirectory {

	public static void main(String[] args) throws IOException {

		Path path1 = Paths.get("folder1");
		if (!Files.exists(path1)) {
			Files.createDirectory(path1);
		}

		// if parent directory is not exists, createDirectory throws exception
		// java.nio.file.NoSuchFileException: folder2/folder22
		//
		Path path2 = Paths.get("folder2/folder22");
		if (!Files.exists(path2)) {
			// Files.createDirectory(path2);
			Files.createDirectories(path2);
		}
	}
}
