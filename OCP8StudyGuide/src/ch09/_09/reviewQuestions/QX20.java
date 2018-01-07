package ch09._09.reviewQuestions;

import java.nio.file.Path;
import java.nio.file.Paths;

public class QX20 {

	public static void main(String[] args) {
		final Path path = Paths.get(".").normalize(); // h1
		int count = 0;
		for (int i = 0; i < path.getNameCount(); ++i) {
			count++;
		}
		System.out.println(path);
		System.out.println(count);
	}
}
