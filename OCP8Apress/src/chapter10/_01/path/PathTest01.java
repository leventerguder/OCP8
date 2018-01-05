package chapter10._01.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {

	public static void main(String[] args) {
		Path path = Paths.get("/folder/folder2/test.txt");
		
		System.out.println(path);
		System.out.println(path.getFileName());
		System.out.println(path.getRoot());
		System.out.println(path.getParent());
	}
}
