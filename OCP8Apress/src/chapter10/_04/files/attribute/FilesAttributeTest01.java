package chapter10._04.files.attribute;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesAttributeTest01 {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("log.txt");
		//
		Object creationTime = Files.getAttribute(path, "creationTime");
		System.out.println(creationTime);
		//
		// lastModifiedTime
		Object lastModifiedTime = Files.getAttribute(path, "lastModifiedTime");
		System.out.println(lastModifiedTime);
	}
}
