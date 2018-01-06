package ch09._03.fileToPath;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileToPathTest01 {

	public static void main(String[] args) {
		File file = new File("/home/user/levent");
		Path path = file.toPath();

		System.out.println(file);
		System.out.println(path);

		//

		Path path2 = Paths.get("/system/admin");
		File file2 = path2.toFile();

		System.out.println(path2);
		System.out.println(file2);
	}
}
