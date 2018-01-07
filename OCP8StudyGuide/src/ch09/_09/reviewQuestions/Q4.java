package ch09._09.reviewQuestions;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Q4 {

	public static void main(String[] args) {
		
		Path path = Paths.get("/zoo/animals/bear/koala/food.txt");
		System.out.println(path.subpath(1, 3).getName(1).toAbsolutePath());
	}
}
