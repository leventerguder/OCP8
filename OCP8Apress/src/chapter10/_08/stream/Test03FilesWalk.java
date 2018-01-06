package chapter10._08.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test03FilesWalk {

	public static void main(String[] args) throws IOException {
		Files.walk(Paths.get(".")).filter(p -> p.getFileName().toString().endsWith(".class"))
				.forEach(System.out::println);
	}
}
