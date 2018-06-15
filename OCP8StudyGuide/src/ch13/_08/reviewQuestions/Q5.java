package ch13._08.reviewQuestions;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class Q5 {
	// What is the result of applying the Files.walkFileTree() method to the
	// current directory and an instance of the following FileVisitor class?
}

//add unimplemented methods!
//class FilePrinter implements FileVisitor<Path> {  // The code will not compile because of line 1.
//	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
//		System.out.println("Found file: " + file.getFileName());
//		return FileVisitResult.CONTINUE;
//	}
//}