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
// Files.isSameFile(Path,Path) method is useful for determining if two Path
// objects relate to the same file within the file system.

// The isSameFile() method first checks if the Path objects are equal in terms
// of equal(), and if so, it automatically returns true without checking to see
// if either file exists. If the Path object equals() comparison returns false,
// then it locates each file to which the path refers in the file system and
// determines if they are the same, throwing
// a checked IOException if either file does not exist.