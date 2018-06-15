package ch13._06.fileVisitor;

import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test02SimpleFileVisitor {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("visitor/folder");
		Files.createDirectories(path);
		
		Files.walkFileTree(path, new DeletePath());
		//By itself FileVisitor instance does not actually do anything.
		//It must be paired with Files.walkFileTree method.
	}
}

// java.nio.file.SimpleFileVisitor<T> implements FileVisitor<T>
// To use SimpleFileVisitor class , you simply extends it and overwrite the methods that you want to implement
// relying on the default implementation for any methods that you do not overwrite.

class DeletePath extends SimpleFileVisitor<Path> {

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		System.out.println("Deleting file : " + file.toAbsolutePath());
		Files.delete(file);
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
		if (exc != null) {
			System.out.println("Exception encountered " + exc.toString());
			throw exc;
		}
		System.out.println("Deleting directory: " + dir.toAbsolutePath());
		Files.delete(dir);
		return FileVisitResult.CONTINUE;
	}
}