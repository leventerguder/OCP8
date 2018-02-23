package ch09._04.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test01GetNameGetNameCount {

	public static void main(String[] args) {

		//
		Path path = Paths.get("/land/hippo/harr.happy");
		System.out.println(path);
		System.out.println(path.getNameCount()); //
		System.out.println(path.getName(1));
		// Returns the number of name elements in the path.

		// Notice that the root element / is not included in the list of names.
		// If the Path object represents the root element itself, then the
		// number of names in the Path object returned by getNameCount() will be
		// 0.

		Path root = Paths.get("/");
		System.out.println(root.getNameCount());

		System.out.println();
		for (int i = 0; i < path.getNameCount(); i++) {
			System.out.println("Element " + i + " is: " + path.getName(i));
		}
	}
}
