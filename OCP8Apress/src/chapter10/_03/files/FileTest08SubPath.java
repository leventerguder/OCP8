package chapter10._03.files;

import java.nio.file.Path;
import java.nio.file.Paths;

//
public class FileTest08SubPath {

	public static void main(String[] args) {
		//
		Path aPath = Paths.get("/OCPJP/programs/../NIO2/src/SubPath.java");
		// ; note that the root itself (in this case, /) is not considered an
		// element in the path.
		aPath = aPath.normalize(); // Path is immutable
		//
		System.out.println(aPath);
		System.out.println(aPath.subpath(2, 3));
	}
}
