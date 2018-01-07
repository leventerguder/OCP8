package ch09._05.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test06FilesMove {

	public static void main(String[] args) throws IOException {

		Path dir1 = Paths.get("original");
		if (!Files.exists(dir1)) {
			Files.createDirectory(dir1);
		}

		Path dir2 = Paths.get("renamed");
		Files.move(dir1, dir2);

		//

		Path f1 = Paths.get("file.txt");
		if (!Files.exists(f1)) {
			Files.createFile(f1);
		}

		Path f2 = Paths.get("renamed.txt");
		Files.move(f1, f2);

	}
}
