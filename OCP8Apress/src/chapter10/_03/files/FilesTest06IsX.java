package chapter10._03.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesTest06IsX {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("isReadable.txt");
		if (!Files.exists(path))
			Files.createFile(path);

		System.out.println(Files.isReadable(path));
		System.out.println(Files.isExecutable(path));
		System.out.println(Files.isWritable(path));
		System.out.println(Files.isHidden(path));
		System.out.println(Files.isRegularFile(path));
		System.out.println(Files.isDirectory(path));

	}
}
