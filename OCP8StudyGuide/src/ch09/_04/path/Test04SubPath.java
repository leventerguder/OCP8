package ch09._04.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test04SubPath {

	public static void main(String[] args) {
		//
		Path path = Paths.get("/mammal/carnivore/raccoon.image");
		System.out.println("Path is: " + path);
		System.out.println("Subpath from 0 to 3 is: " + path.subpath(0, 3));
		System.out.println("Subpath from 1 to 3 is: " + path.subpath(1, 3));
		System.out.println("Subpath from 1 to 2 is: " + path.subpath(1, 2));

		// subpath(int,int) method does not include the root of the file.

		// java.lang.IllegalArgumentException
		// System.out.println("Subpath from 0 to 4 is: "+path.subpath(0,4));
		//

		// java.lang.IllegalArgumentException
		//System.out.println("Subpath from 1 to 1 is: " + path.subpath(1, 1));
	}
}
