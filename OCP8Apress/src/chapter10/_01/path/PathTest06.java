package chapter10._01.path;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest06 {

	public static void main(String[] args) {
		
		File file1 = new File("/folder1/f.txt");
		Path path1 = file1.toPath();
		System.out.println(path1);
		
		
		Path path2 = Paths.get("/folder/f2.txt");
		File file2 = path2.toFile();		
		System.out.println(file2);
		
	}
}
