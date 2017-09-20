package chapter10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesMoveTest01 {

	public static void main(String[] args) throws IOException {
		//
		Path path1 = Files.createFile(Paths.get("move.txt"));
		Path path2 = Paths.get("copied.txt");
		Files.move(path1, path2, StandardCopyOption.REPLACE_EXISTING);
	}
}
