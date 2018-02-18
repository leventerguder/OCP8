package chapter10.mock;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class QX3 {
	public static void main(String[] args) throws IOException {
		// Path aFilePath = Paths.get("D:\\directory\\file.txt"); // for window
		Path aFilePath = Paths.get("/directory/file.txt");
		System.out.println(aFilePath.isAbsolute());
	}
}
