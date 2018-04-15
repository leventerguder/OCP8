package mock;

import java.nio.file.Path;
import java.nio.file.Paths;

public class QX59 {

	public static void main(String[] args) {
		
		Path testFilePath = Paths.get(".\\Test");
		System.out.println("file name:" + testFilePath.getFileName());
		System.out.println("absolute path:" + testFilePath.toAbsolutePath());
		System.out.println("Normalized path:" + testFilePath.normalize());
	}
}
