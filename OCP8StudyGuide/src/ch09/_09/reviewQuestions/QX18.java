package ch09._09.reviewQuestions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class QX18 {

	public static void main(String[] args) throws IOException {
		
		Path path1 = Paths.get("/lizard/./").resolve(Paths.get("walking.txt"));
		Path path2 = new File("/lizard/././actions/../walking.txt").toPath();

		System.out.print(Files.isSameFile(path1, path2));
		System.out.print(" " + path1.equals(path2));
		System.out.print(" " + path1.normalize().equals(path2.normalize()));

	}
}
