package chapter10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesTest01 {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("log.txt");
		System.out.println(path);
		System.out.println(path.toAbsolutePath());
		System.out.println(path.toRealPath(LinkOption.NOFOLLOW_LINKS));
		
		//
		Path path2 = Paths.get("/Users/levent/javaworld/git/OCP8/OCP8Apress/log.txt");
		
		boolean isSameFile = Files.isSameFile(path, path2);
		System.out.println(path.equals(path2));
		System.out.println(path.getClass());
		System.out.println(isSameFile);
	}
}
