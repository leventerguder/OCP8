package ch19;

import java.nio.file.Path;
import java.nio.file.Paths;

public class QX19 {

	public static void main(String[] args) {
		//
		Path p1 = Paths.get("./locks");
		Path p2 = Paths.get("/found/red.zip");
		System.out.println(p1.relativize(p2));
		System.out.println(p2.relativize(p1));
	}
}

// java.lang.IllegalArgumentException: 'other' is different type of Path
// D. None of the above