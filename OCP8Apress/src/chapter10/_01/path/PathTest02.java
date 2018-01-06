package chapter10._01.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {

	public static void main(String[] args) {
		Path path = Paths.get("./Test");
		System.out.println(path.getFileName());
		System.out.println(path.toUri());
		System.out.println(path.toAbsolutePath());
		System.out.println(path.getRoot());
		System.out.println(path.normalize());
		System.out.println(path.toAbsolutePath().normalize());
		System.out.println(path.isAbsolute());
	}
}
