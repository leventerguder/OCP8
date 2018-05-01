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

// A depth-first search traverses the structure from the root to an arbitrary
// leaf and then navigates back up toward the root, traversing fully down any
// paths it skipped along the way.

// The Files.walk(path) method returns a Stream<Path> object that traverses the
// directory in a depth-first, lazy manner.

// walk method will not traverse symbolic links by default.