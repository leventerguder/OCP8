package ch09._04.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test05Relativize {

	public static void main(String[] args) {

		Path path1 = Paths.get("fish.txt");
		Path path2 = Paths.get("birds.txt");
		//
		System.out.println(path1.relativize(path2));
		System.out.println(path2.relativize(path1));

		Path path3 = Paths.get("/user/guess");
		Path path4 = Paths.get("/user/admin/config");

		//

		System.out.println(path3.relativize(path4));
		System.out.println(path4.relativize(path3));

		// The relativize() method requires that both paths be absolute or both
		// relative, and it will throw an IllegalArgumentException if a relative
		// path value is mixed with an absolute path value. For example, the
		// following would throw an exception at runtime:

		// Path path5 = Paths.get("/primate/chimpanzee");
		// Path path6 = Paths.get("bananas.txt");
		// path5.relativize(path6);
		// THROWS EXCEPTION AT RUNTIME

		// java.lang.IllegalArgumentException

		// On Windows-based systems, it also requires that if absolute paths are
		// used, then both paths must have the same root directory or drive
		// letter. For example, the following would also throw an
		// IllegalArgumentException at runtime in a Windows-based system since
		// they use different roots:
		// Path path5 = Paths.get("c:\\primate\\chimpanzee");
		// Path path6 = Paths.get("d:\\storage\\bananas.txt"); 
		// path5.relativize(path6); // THROWS EXCEPTION AT RUNTIME (windows)
	}
}
