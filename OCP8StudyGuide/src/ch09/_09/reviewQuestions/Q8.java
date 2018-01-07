package ch09._09.reviewQuestions;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Q8 {

	public static void main(String[] args) {
		Path path1 = Paths.get("/pets/../cat.txt");
		Path path2 = Paths.get("./dog.txt");

		System.out.println(path1.resolve(path2));
		System.out.println(path2.resolve(path1));

		// the resolve() method does not normalize any path symbols
		// calling resolve() with an absolute path as a parameter returns the
		// absolute path
	}
}
