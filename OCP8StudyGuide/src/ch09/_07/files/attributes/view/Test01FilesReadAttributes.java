package ch09._07.files.attributes.view;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Test01FilesReadAttributes {

	public static void main(String[] args) throws IOException {
		Path dir = Paths.get("folder");

		if (!Files.exists(dir)) {
			Files.createDirectory(dir);
		}

		BasicFileAttributes data = Files.readAttributes(dir, BasicFileAttributes.class);

		System.out.println(data.isDirectory());
		System.out.println(data.isRegularFile());
		System.out.println(data.isSymbolicLink());
		System.out.println(data.isOther());
		System.out.println(data.creationTime());
		System.out.println(data.lastModifiedTime());
		System.out.println(data.lastAccessTime());
		System.out.println(data.size());
		System.out.println(data.fileKey());
		

	}
}
