package chapter10.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesWalkTest01 {

	public static void main(String[] args) throws IOException {
		Files.walk(Paths.get(".")).forEach(System.out::println);
	}
}
