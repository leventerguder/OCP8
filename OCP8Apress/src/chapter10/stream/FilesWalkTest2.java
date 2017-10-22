package chapter10.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesWalkTest2 {

	public static void main(String[] args) throws IOException {
		Files.walk(Paths.get(".")).filter(p -> p.getFileName().toString().endsWith(".class"))
				.forEach(System.out::println);
	}
}
