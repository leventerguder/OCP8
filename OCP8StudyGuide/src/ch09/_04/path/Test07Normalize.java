package ch09._04.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test07Normalize {

	public static void main(String[] args) {

		Path path1 = Paths.get("../../test/../sub/a/b.txt");
		System.out.println(path1);
		System.out.println(path1.toAbsolutePath());
		System.out.println(path1.toAbsolutePath().normalize());

	}
}
