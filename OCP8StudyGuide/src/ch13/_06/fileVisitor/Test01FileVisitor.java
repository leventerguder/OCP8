package ch13._06.fileVisitor;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Test01FileVisitor {

	// DirectoryStream interface is used to visit the contents of a single
	// directory the FileVisitor<T> interface is used to visit an entire
	// directory tree.

	// java.nio.file.FileVisitor<T>
	
	// FileVisitor visitFile(T , BasicFileAttributes) throws IOException
	// FileVisitor visitFileFailed(T , IOException ) throws IOException
	// FileVisitor preVisitDirectory(T, BasicFileAttributes) throws IOException
	// FileVisitor postVisitDirectory(T, IOException) throws IOException

	// java.nio.file.FileVisitResult
	// CONTINUE
	// TERMINATE
	// SKIP_SUBTREE
	// SKIP_SIBLINGS
}

class FindAndCopyFile implements FileVisitor<Path> {

	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

		if (file.getFileName().equals("Zoo.txt")) {
			Files.copy(file, Paths.get("Zoo2.txt"));
			return FileVisitResult.TERMINATE;
		} else {
			return FileVisitResult.CONTINUE;
		}
	}

	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		return FileVisitResult.TERMINATE;
	}

	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
		return FileVisitResult.CONTINUE;
	}

}
