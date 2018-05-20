package ch19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;

public class QX18 {

	public static void main(String[] args) throws IOException {

		Path file = Paths.get("/data/movie.txt");
		BasicFileAttributes b1 = Files.readAttributes(file, BasicFileAttributes.class);
		BasicFileAttributes b2 = Files.readAttributes(file, DosFileAttributes.class);
		BasicFileAttributes b3 = Files.readAttributes(file, PosixFileAttributes.class);
	}
}
