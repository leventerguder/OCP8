package ch09._01.pathAndPaths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test01Path {

	public static void main(String[] args) {
		
		Path path1 = Paths.get("/home/levent");
		Path path2 = Paths.get("pandas", "sample.png");
		Path path3 = Paths.get("/", "home", "levent");
		
		System.out.println(path1);
		System.out.println(path2);
		System.out.println(path3);
	}
}
