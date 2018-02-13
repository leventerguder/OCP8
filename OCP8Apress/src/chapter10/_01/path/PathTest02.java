package chapter10._01.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {

	public static void main(String[] args) {
		Path path = Paths.get("folder/.././file.txt");
		
		System.out.println("getRoot() : " + path.getRoot());
		System.out.println("geFileName() : " + path.getFileName());
		System.out.println("toUri() : " + path.toUri());
		System.out.println("normalize() : " + path.normalize());
		System.out.println("toAbsolutePath() : " + path.toAbsolutePath());
		System.out.println("toAbsolutePath().normalize() : " + path.toAbsolutePath().normalize());		
		System.out.println("isAbsolute() : " + path.isAbsolute());
		
	}
}
