package chapter10;

import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesTest03 {

	public static void main(String[] args) throws IOException {
		Path path1 = Paths.get("log.txt");
		Path path2 = Paths.get("/Users/levent/javaworld/git/OCP8/OCP8Apress/log.txt");

		System.out.println(Files.isSameFile(path1, path2));
		// java.nio.file.NoSuchFileException: if the file not exists.

		boolean exists = Files.exists(path1);
		System.out.println(exists);

		boolean isDirectory = Files.isDirectory(path1);
		System.out.println(isDirectory);
		
		boolean isRegularFile = Files.isRegularFile(path1);
		System.out.println(isRegularFile);
	}
}
