package ch09._04.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test07Normalize {

	public static void main(String[] args) {
		Path p1 = Paths.get("../test/a/b.txt");
		System.out.println(p1);
		System.out.println(p1.toAbsolutePath());
		System.out.println(p1.toAbsolutePath().normalize());
	}
}
