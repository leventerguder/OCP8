package chapter10;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesTest02 {

	public static void main(String[] args) {
		Path path = Paths.get("log.txt");
		
		System.out.println(Files.isReadable(path));
		System.out.println(Files.isExecutable(path));
		System.out.println(Files.isWritable(path));
		System.out.println(Files.isRegularFile(path));
	}
}
