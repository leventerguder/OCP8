package ch09._06.files.attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;

public class Test04FilesGetLastModifiedTime {

	public static void main(String[] args) throws IOException {
		
		Path dir = Paths.get("folder");

		if (!Files.exists(dir)) {
			Files.createDirectory(dir);
		}
		FileTime fileTime = Files.getLastModifiedTime(dir);
		System.out.println(fileTime);

		Files.setLastModifiedTime(dir, FileTime.fromMillis(System.currentTimeMillis()));
	}
}
