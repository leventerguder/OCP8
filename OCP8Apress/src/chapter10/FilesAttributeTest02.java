package chapter10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
//import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;

public class FilesAttributeTest02 {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("log.txt");
		BasicFileAttributes fa = Files.readAttributes(path, BasicFileAttributes.class);
		System.out.println(fa.isDirectory());
		System.out.println(fa.lastAccessTime());
		System.out.println(fa.creationTime());
		System.out.println(fa.isRegularFile());
		System.out.println(fa.getClass());
		
		//
		PosixFileAttributes pfa = Files.readAttributes(path, PosixFileAttributes.class);
		System.out.println(pfa.owner());
		
		//DosFileAttributes dfa = Files.readAttributes(path,DosFileAttributes.class);
		//error in unix system
	}
}
