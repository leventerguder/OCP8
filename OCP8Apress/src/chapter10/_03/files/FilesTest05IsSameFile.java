package chapter10._03.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesTest05IsSameFile {

	public static void main(String[] args) throws IOException {

		Path p1 = Paths.get("isSameFile.txt");
		if (!Files.exists(p1))
			Files.createFile(p1);

		Path p2 = Paths.get("/Users/levent/javaworld/git/OCP8/OCP8Apress/isSameFile.txt");
		boolean isSameFile = Files.isSameFile(p1, p2);
		//
		System.out.println(isSameFile);

	}
}
