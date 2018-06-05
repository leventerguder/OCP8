package mock;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class QX49 {

	public static void main(String[] args) {

		Path currPath = Paths.get(".");
		try (DirectoryStream<Path> javaFiles = Files.newDirectoryStream(currPath, "*.{java}")) {
			for (Path javaFile : javaFiles) {
				System.out.println(javaFile);
			}
		} catch (IOException ioe) {
			System.err.println("IO Error occurred");
			System.exit(-1);
		}
	}
}
