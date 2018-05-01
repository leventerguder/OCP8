package ch09._08.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

public class Test02FilesFind {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get(".");

		BiPredicate<Path, BasicFileAttributes> matcher = (p, b) -> p.toString().endsWith(".java") && b.size() > 10;

		// This example is similar to our previous Files.walk() example in that
		// it will search a directory for files that end with the .java
		// extension.
		// It is more advanced, though, in that it applies a last-modified-time
		// filter using the BasicFileAttributes object
		Files.find(path, 10, matcher).forEach(System.out::println);

	}
}
