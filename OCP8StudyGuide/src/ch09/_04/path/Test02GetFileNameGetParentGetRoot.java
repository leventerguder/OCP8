package ch09._04.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test02GetFileNameGetParentGetRoot {

	public static void main(String[] args) {
		//
		Path path = Paths.get("/folder/sub/a.txt");
		System.out.println("getFileName : " + path.getFileName());
		System.out.println("getParent : " + path.getParent());
		System.out.println("getRoot : " + path.getRoot());
		System.out.println();

		Path path2 = Paths.get("/folder/sub");
		System.out.println("getFileName : " + path2.getFileName());
		System.out.println("getParent : " + path2.getParent());
		System.out.println("getRoot : " + path2.getRoot());
		System.out.println();

		Path path3 = Paths.get("folder/relative.txt");
		System.out.println("getFileName : " + path3.getFileName());
		System.out.println("getParent : " + path3.getParent());
		System.out.println("getRoot : " + path3.getRoot());
		System.out.println();

		Path path4 = Paths.get("/");
		System.out.println("getFileName : " + path4.getFileName());
		System.out.println("getParent : " + path4.getParent());
		System.out.println("getRoot : " + path4.getRoot());
	}
}
