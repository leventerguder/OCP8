package chapter10._07.delete;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDeleteTest01 {

	public static void main(String[] args) throws IOException {

		Path p1 = Paths.get("deleted.txt");

		// java.nio.file.NoSuchFileException:
		// Files.delete(p1);
		// The file must exists!
		
		if(!Files.exists(p1)) {
			Files.createFile(p1);
		}
		
		Files.deleteIfExists(p1);
	}
}
