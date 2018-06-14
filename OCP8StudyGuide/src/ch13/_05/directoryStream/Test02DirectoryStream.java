package ch13._05.directoryStream;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test02DirectoryStream {

	public static void main(String[] args) {

		Path path = Paths.get("/user/home");
		// DirectoryStream<Path> stream = Files.newDirectoryStream(path)
		// .filter(p -> p.getFileName().startsWith("zoo")) // DOES NOT COMPILE
		// .forEach(System.out::println);
		
		// DirectoryStream does not inherit java.util.stream.Stream , we cannot
		// apply any stream-based methods.

	}
}
