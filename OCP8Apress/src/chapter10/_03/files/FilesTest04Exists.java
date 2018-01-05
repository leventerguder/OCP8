package chapter10._03.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesTest04Exists {

	public static void main(String[] args) throws IOException {
		//
		Path p1 = Paths.get("exists.txt");
		Files.createFile(p1);
		//
		boolean isExists = Files.exists(p1);
		System.out.println(isExists);
	}
}
