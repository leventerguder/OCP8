package chapter10;

import java.nio.file.Path;
import java.nio.file.Paths;

//
public class SubPath {

	public static void main(String[] args) {
		//
		Path aPath = Paths.get("/OCPJP/programs/../NIO2/src/SubPath.java");
		aPath = aPath.normalize(); // Path is immutable
		//
		System.out.println(aPath);
		System.out.println(aPath.subpath(2, 3));
	}
}
