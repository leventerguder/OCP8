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
		
		Path path5 = Paths.get("/a/b");
		Path path6 = Paths.get("/a/b/c/d");

		System.out.println(path5.relativize(path6));
		System.out.println(path6.relativize(path5));
		
		
		Path path7 = Paths.get("/folder");
		Path path8 = Paths.get("/folder2");
		
		System.out.println(path7.relativize(path8));
		
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

		// Constructs a relative path between this path and a given path.
		//
		// Relativization is the inverse of resolution. This method attempts to
		// construct a relative path that when resolved against this path, yields a path
		// that locates the same file as the given path. For example, on UNIX, if this
		// path is "/a/b" and the given path is "/a/b/c/d" then the resulting relative
		// path would be "c/d". Where this path and the given path do not have a root
		// component, then a relative path can be constructed. A relative path cannot be
		// constructed if only one of the paths have a root component. Where both paths
		// have a root component then it is implementation dependent if a relative path
		// can be constructed. If this path and the given path are equal then an empty
		// path is returned.
		//
		// For any two normalized paths p and q, where q does not have a root component,
		//
		// p.relativize(p.resolve(q)).equals(q)
		//
		// When symbolic links are supported, then whether the resulting path, when
		// resolved against this path, yields a path that can be used to locate the same
		// file as other is implementation dependent. For example, if this path is
		// "/a/b" and the given path is "/a/x" then the resulting relative path may be
		// "../x". If "b" is a symbolic link then is implementation dependent if
		// "a/b/../x" would locate the same file as "/a/x".
		// Parameters:other the path to relativize against this pathReturns:the
		// resulting relative path, or an empty path if both paths are
		// equalThrows:IllegalArgumentException - if other is not a Path that can be
		// relativized against this path
		//
	}
}
