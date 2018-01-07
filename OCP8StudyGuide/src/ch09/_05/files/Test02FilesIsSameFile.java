package ch09._05.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test02FilesIsSameFile {

	public static void main(String[] args) throws IOException {
		//
		Path path1 = Paths.get("src/ch09/_05/files/log.txt");
		Path path2 = Paths.get("src/ch09/_05/files/log.txt");
		
		System.out.println(Files.isSameFile(path1, path2));
	}
}
