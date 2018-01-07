package ch09._08.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test01FilesWalk {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get(".");
		Files.walk(path).filter(p -> p.toString().endsWith(".java")).forEach(System.out::println);
	}
}
