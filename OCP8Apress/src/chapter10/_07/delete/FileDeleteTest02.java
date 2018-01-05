package chapter10._07.delete;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDeleteTest02 {

	public static void main(String[] args) throws IOException {
		Path p1 = Paths.get("delete");
		Path p2 = Paths.get("delete/sub");

		if (!Files.exists(p1)) {
			Files.createDirectories(p1);
		}
		if (!Files.exists(p2)) {
			Files.createDirectories(p2);
		}

		//java.nio.file.DirectoryNotEmptyException
		Files.delete(p1);
		//In the case of a directory, the delete() method should be invoked on an empty directory; otherwise, the method will fail
	}
}
