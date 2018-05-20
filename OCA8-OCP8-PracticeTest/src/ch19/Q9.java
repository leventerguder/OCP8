package ch19;

import java.nio.file.*;

public class Q9 {

	public static String doTrick(Path path) {
		return path.subpath(2, 3).getName(1).toAbsolutePath().toString();
		// java.lang.IllegalArgumentException
		// getName(1)
	}

	public static void main(String[] args) {

		Path path = Paths.get("/bag/of/tricks/.././disappear.txt");
		//
		System.out.println(doTrick(path));
	}
}
