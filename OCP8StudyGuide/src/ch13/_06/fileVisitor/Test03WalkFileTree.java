package ch13._06.fileVisitor;

import java.io.IOException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;

public class Test03WalkFileTree {

	// Path walkFileTree(Path , FileVisitor)
	// Path walkFileTree(Path , Set<FileVisitOption> , int maxDepth ,
	// FileVisitor)
	// walkFileTree method will not follow symbolic links by default.
	// To force the method to traverse symbolic links , you can pass a set that
	// contains the FileVisitOption.FOLLOW_LINKS

	public static void main(String[] args) throws IOException {
		Files.walkFileTree(Paths.get("."), EnumSet.of(FileVisitOption.FOLLOW_LINKS), 5, new FindTextFiles());
	}
}

class FindTextFiles extends SimpleFileVisitor<Path> {
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		if (file.getFileName().endsWith("txt")) {
			System.out.println("Found file: " + file.toAbsolutePath());
		}
		return FileVisitResult.CONTINUE;
	}

	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		if (exc instanceof FileSystemLoopException) {
			System.err.println("Circular reference detected: " + file.toString());
		} else if (exc != null) {
			throw exc;
		}
		return FileVisitResult.CONTINUE;
	}

}