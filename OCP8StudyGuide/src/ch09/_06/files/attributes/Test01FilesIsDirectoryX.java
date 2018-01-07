package ch09._06.files.attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test01FilesIsDirectoryX {

	public static void main(String[] args) throws IOException {
		
		Path dir = Paths.get("folder");
		
		if(!Files.exists(dir)) {
			Files.createDirectory(dir);
		}
		//
		System.out.println(Files.isDirectory(dir));
		System.out.println(Files.isRegularFile(dir));
		System.out.println(Files.isSymbolicLink(dir));
		
	}
}
