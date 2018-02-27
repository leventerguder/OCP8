package ch09._04.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test06Resolve {

	public static void main(String[] args) {
		//
		Path path1 = Paths.get("/cats/../panther");
		Path path2 = Paths.get("food");

		System.out.println(path1.resolve(path2));
		System.out.println(path2.resolve(path1));
		

		Path path3 = Paths.get("/f1/f2");
		Path path4 = Paths.get("f3");
		System.out.println(path3.resolve(path4));
		
		System.out.println(path4.resolve(path3));

		
		
	}
}
