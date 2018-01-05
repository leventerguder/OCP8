package chapter10._05.copy;

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

		// The copy methods cannot copy a non-empty directory. If you attempt to
		// copy a non-empty directory using the copy methods, only the name of
		// the target directory is created, not its sub files and directories.

		// http://www.codejava.net/java-se/file-io/java-nio-copy-file-or-directory-examples
	}
}
