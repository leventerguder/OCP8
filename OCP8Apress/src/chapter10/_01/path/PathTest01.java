package chapter10._01.path;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {

	public static void main(String[] args) {

		// The Path interface is a programming abstraction for a path.

		Path path = Paths.get("/folder/folder2/folder3/test.txt");
		//
		System.out.println(path);
		System.out.println("getFileName() : " + path.getFileName());
		System.out.println("getRoot(): " + path.getRoot());
		System.out.println("getParent() : " + path.getParent());
		System.out.println("getNameCount() : " + path.getNameCount());
		System.out.println("getName(0) : " + path.getName(0));
		System.out.println("subpath () : " + path.subpath(1, 4));

		System.out.println("getClass() : " + path.getClass());
		System.out.println("getFileSystem() : " + path.getFileSystem());

		System.out.println("File.pathSeparator : " + File.pathSeparator);
		System.out.println("File.separator : " + File.separator);

		System.out.println("System.getProperty : " + System.getProperty("path.separator"));
	}
}
