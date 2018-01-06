package ch09._01.pathAndPaths;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test02Path {

	public static void main(String[] args) throws URISyntaxException {
		
		Path path1 = Paths.get(new URI("file:///home/levent/"));

		// URIs must reference absolute paths at runtime
		// Path path2 = Paths.get(new URI("file://relatives/file.txt"));
		// java.lang.IllegalArgumentException

		System.out.println(path1);
	}
}
