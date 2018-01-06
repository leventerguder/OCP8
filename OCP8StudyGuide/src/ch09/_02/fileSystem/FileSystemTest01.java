package ch09._02.fileSystem;

import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystemTest01 {

	public static void main(String[] args) {
		
		Path p1 = FileSystems.getDefault().getPath("/home/system/");
		System.out.println(p1);
		
	}
}
