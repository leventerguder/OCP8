package ch09._09.reviewQuestions;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Q1 {

	public static void main(String[] args) {
		Path path = Paths.get("/user/.././root", "../kodiacbear.txt");
		path.relativize(Paths.get("/lion"));
		System.out.println(path);
	}
}
