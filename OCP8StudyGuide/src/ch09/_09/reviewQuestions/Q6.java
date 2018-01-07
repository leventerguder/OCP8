package ch09._09.reviewQuestions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q6 {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get(".");
		
		boolean myBoolean = Files.walk(path).filter((p) -> !path.equals(p)) // w1
				.findFirst().isPresent(); // w2
		System.out.println(myBoolean ? "Sub-directory" : "No Sub-directory");
	}
}
