package ch13._08.reviewQuestions;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class QX16 {

	// It compiles and is capable of recursively deleting all matching files in
	// the /zoo/data directory tree.
	
	// It compiles but may throw an exception at runtime.
	public static void main(String[] args) throws IOException {
		Files.walkFileTree(Paths.get("/zoo/data"), new DeleteFilesWithExtension("txt"));
	}
}

class DeleteFilesWithExtension extends SimpleFileVisitor<Path> {
	private String extension;

	public DeleteFilesWithExtension(String extension) {
		this.extension = extension;
	}

	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		if (file.getFileName().endsWith(extension) && !attrs.isSymbolicLink())
			Files.delete(file);
		return FileVisitResult.CONTINUE;
	}
}