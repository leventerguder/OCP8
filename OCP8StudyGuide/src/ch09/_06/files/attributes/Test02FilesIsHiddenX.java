package ch09._06.files.attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test02FilesIsHiddenX {

	public static void main(String[] args) throws IOException {

		Path path1 = Paths.get("sample.txt");

		if (!Files.exists(path1)) {
			Files.createFile(path1);
		}
		//
		
		System.out.println(Files.isHidden(path1));
		System.out.println(Files.isReadable(path1));
		System.out.println(Files.isWritable(path1));
		System.out.println(Files.isExecutable(path1));

	}
}
