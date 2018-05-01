package ch09._09.reviewQuestions;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Q1 {

	public static void main(String[] args) {
		Path path = Paths.get("/user/.././root", "../kodiacbear.txt");
		path.normalize().relativize(Paths.get("/lion"));
		// Implementations of this interface are immutable and safe for use by
		// multiple concurrent threads.
		System.out.println(path);
	}
}
