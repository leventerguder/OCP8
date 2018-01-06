package ch09._04.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test03IsAbsoluteToAbsolutePath {

	public static void main(String[] args) {	

		Path p1 = Paths.get("relative/path/a.txt");

		boolean isAbsolute = p1.isAbsolute();
		Path p2 = p1.toAbsolutePath();

		System.out.println(isAbsolute);
		System.out.println(p2);

		// for linux or mac , / is root , for windows c:/ is root
		System.out.println(Paths.get("/stripes/zebra.exe").isAbsolute());
		System.out.println(Paths.get("c:/goats/Food.java").isAbsolute());
	}
}
