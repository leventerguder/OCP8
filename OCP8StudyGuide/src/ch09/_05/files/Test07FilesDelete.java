package ch09._05.files;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test07FilesDelete {

	public static void main(String[] args) throws IOException {

		// Files.delete(Path) method deletes a file or empty directory within
		// the file system.
		// delete method throws the checked IOException

		Path path1 = Paths.get("deleteMe.txt");
		if (!Files.exists(path1)) {
			Files.createFile(path1);
		}

		// it throws a NoSuchFileException if the file or directory does not
		// exist.
		Files.delete(path1); // deleted

		System.out.println(Files.deleteIfExists(path1));

		// if the path represent a non-empty directory , the operation will
		// throw the runtime DirectoryNotEmptyException
		// if the target of the path is a symbol link , then the symbolic link
		// will be deleted , not the target of the link.

		Path path2 = Paths.get("folder", "sub", "file.txt");
		if (!Files.exists(path2)) {
			Files.createDirectories(path2.getParent());
			Files.createFile(path2);
		}
		try {
			Files.delete(path2.getParent());
		} catch (DirectoryNotEmptyException e) {
			e.printStackTrace();
			// java.nio.file.DirectoryNotEmptyException: folder/sub
		}
	}
}
