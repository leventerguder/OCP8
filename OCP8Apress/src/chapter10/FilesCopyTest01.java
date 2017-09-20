package chapter10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesCopyTest01 {

	public static void main(String[] args) throws IOException {
		Path path1 = Paths.get("log.txt");
		Path path2 = Paths.get("copy.txt");

		// Files.copy(path1, path2);
		Files.copy(path1, path2, StandardCopyOption.REPLACE_EXISTING);

		// When you try copying the file for the second time, you get a
		// FileAlreadyExistsException because the destination file already
		// exists.
	}
}
