package ch09._04.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test02GetFileNameGetParentGetRoot {

	public static void main(String[] args) {
		//
		Path path = Paths.get("/folder/sub/a.txt");
		System.out.println(path.getFileName());
		System.out.println(path.getParent());
		System.out.println(path.getRoot());
		
		Path path2 = Paths.get("/folder/sub");
		System.out.println(path2.getFileName());
		System.out.println(path2.getParent());
		System.out.println(path2.getRoot());
		
		
		Path path3 = Paths.get("folder/relative.txt");
		System.out.println(path3.getFileName());
		System.out.println(path3.getParent());
		System.out.println(path3.getRoot());
		
	}
}
