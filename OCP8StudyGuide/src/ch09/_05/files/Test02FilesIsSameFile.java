package ch09._05.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test02FilesIsSameFile {

	public static void main(String[] args) throws IOException {
		//
		Path path1 = Paths.get("src/ch09/_05/files/log1.txt");
		Path path2 = Paths.get("src/ch09/_05/files/log1.txt");

		System.out.println(path1.equals(path2));
		System.out.println(Files.isSameFile(path1, path2));
	}
}
// The isSameFile() method rst checks if the Path objects are equal in terms of
// equal(), and if so, it automatically returns true without checking to see if
// either le exists.

// This isSameFile() method does not compare the contents of the file. For
// example, two files may have identical content and attributes, but if they are
// in different locations, then this method will return false.
