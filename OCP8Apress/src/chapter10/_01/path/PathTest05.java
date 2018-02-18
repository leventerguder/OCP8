package chapter10._01.path;

import java.nio.file.Path;
import java.nio.file.Paths;

//
public class PathTest05 {

	public static void main(String[] args) {
		//
		Path path = Paths.get("/folder1/folder2/folder3/folder4");

		//
		System.out.println(path);
		System.out.println(path.subpath(2, 3));
	}
}
