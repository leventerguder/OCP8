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

		// all the directories (except the last one, if you are copying a directory) on
		// the specified path must exist to avoid NoSuchFileException.

		// What if you try copying a directory? It will work, but remember that it will
		// only copy the top-level directory, not the files/directories contained within
		// that directory.

		// if you copy a directory using the copy() method, it does not copy the
		// files/directories contained in the source directory; you need to explicitly
		// copy them to the destination folder.
	}
}
