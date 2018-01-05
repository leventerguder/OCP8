package chapter10._01.path;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest04 {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("testRealPath.txt");
		// Path path = Paths.get("noNushFile.txt");
		// java.nio.file.NoSuchFileException
		Path realPath = path.toRealPath();

		System.out.println(realPath);
	}
}
