package ch19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class QX26 {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("/");
		// Files.walk(path, 1).map(p ->
		// p.toRealPath()).forEach(System.out::println);
		// compile error
	}
}
