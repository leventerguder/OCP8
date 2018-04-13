package chapter10._01.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest03 {

	public static void main(String[] args) {
		Path p1 = Paths.get("C:\test\testfile.txt");
		Path p2 = Paths.get("C:\\test\\testfile.txt");
		// WATCHOUT \t means a tab character
		System.out.println(p1);
		System.out.println(p2);
	}
}
