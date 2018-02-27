package ch09._04.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test03IsAbsoluteToAbsolutePath {

	public static void main(String[] args) {

		Path path1 = Paths.get("relative/path/a.txt");
		Path path2 = Paths.get("/stripes/zebra.exe");
		Path path3 = Paths.get("c:/goats/Food.java");

		System.out.println("isAbsolute : " + path1.isAbsolute());
		System.out.println("toAbsolutePath : " + path1.toAbsolutePath());
		System.out.println("isAbsolute : " + path2.isAbsolute());
		System.out.println("isAbsolute : " + path3.isAbsolute());

		// for linux or mac , / is root , for windows c:/ is root

	}
}
