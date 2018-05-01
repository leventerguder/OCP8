package ch09._04.path;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test08ToRealPath {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("src/ch09/_04/path/toRealPathFile.xml");
		System.out.println(path.toRealPath());

		// toRealPath , the specified file is required. otherwise exception
		// occurs!
		// java.nio.file.NoSuchFileException

		// The toRealPath() method performs additional steps, such as removing
		// redundant path elements. In other words, it implicitly calls
		// normalize() on the resulting absolute path.
		
		System.out.println(Paths.get(".").toRealPath());

	}
}
