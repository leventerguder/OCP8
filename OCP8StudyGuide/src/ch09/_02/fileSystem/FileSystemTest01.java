package ch09._02.fileSystem;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystemTest01 {

	public static void main(String[] args) {

		FileSystem fs = FileSystems.getDefault();
		System.out.println(fs);
		Path p1 = fs.getPath("/home/system/");
		System.out.println(p1);

	}
}
