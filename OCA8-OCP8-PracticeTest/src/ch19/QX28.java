package ch19;

import java.nio.file.Path;

public class QX28 {

	public Path makeAbsolute(Path p) {
		if (p != null && !p.isAbsolute()) {
			return p.toAbsolutePath();
		}
		return p;
	}
}
// The method compiles and returns a Path value that may not be equivalent to the input argument.