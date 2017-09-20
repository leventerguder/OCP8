package chapter10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDeleteTest01 {

	public static void main(String[] args) throws IOException {
		Path path1 = Files.createFile(Paths.get("create.txt"));

		boolean exists = Files.exists(path1);
		//
		System.out.println(exists);
		Files.delete(path1);

		exists = Files.exists(path1);
		System.out.println(exists);
	}
}
