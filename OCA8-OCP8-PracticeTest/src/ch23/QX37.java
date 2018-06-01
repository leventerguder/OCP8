package ch23;

import java.nio.file.Path;
import java.nio.file.Paths;

public class QX37 {

	public static void main(String[] args) {

		Path x = Paths.get(".", "song", "..", "/note");
		Path y = Paths.get("/dance/move.txt");

		x.normalize(); // IMMUTABLE!

		System.out.println(x.resolve(y));
		System.out.println(y.relativize(x)); // Exception

		// F. The code compiles but an exception is thrown at runtime.
		
		// relativize() method requires both Path values to be absolute or both to be relative
	}
}
