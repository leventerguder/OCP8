package ch09._05.files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test01FilesExists {

	public static void main(String[] args) {
		Path path1 = Paths.get("src/ch09/_05/files/log.txt");
		Path path2 = Paths.get("notexists.txt");

		System.out.println(Files.exists(path1));
		System.out.println(Files.exists(path2));
	}
}
