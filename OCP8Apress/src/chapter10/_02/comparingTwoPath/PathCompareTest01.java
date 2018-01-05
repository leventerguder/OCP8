package chapter10._02.comparingTwoPath;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathCompareTest01 {

	public static void main(String[] args) throws IOException {
		//
		Path pathAbsolute1 = Paths.get("/Users/levent/javaworld/git/OCP8/OCP8Apress/compare.txt");
		Path pathAbsolute2 = Paths.get("/Users/levent/javaworld/git/OCP8/OCP8Apress/compare.txt");
		Path pathRelative1 = Paths.get("compare.txt");
		Path pathRelative2 = Paths.get("compare.txt");

		//
		System.out.println(pathAbsolute1.compareTo(pathAbsolute2) == 0); // true
		System.out.println(pathRelative1.compareTo(pathRelative2) == 0); // true
		System.out.println(pathAbsolute1.compareTo(pathRelative1) == 0); // false
		//

		// If the given object is not a Path, or is a Path associated with a
		// different FileSystem, then this method returns false.
		// This method does not access the file system and the file is not
		// required to exist.
		System.out.println(pathAbsolute1.equals(pathAbsolute2)); // true
		System.out.println(pathRelative1.equals(pathRelative2)); // true
		System.out.println(pathAbsolute1.equals(pathRelative2)); // false

	}
}
