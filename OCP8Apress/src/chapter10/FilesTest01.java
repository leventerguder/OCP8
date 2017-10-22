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
		System.out.println(path.getParent());
		System.out.println(path.getFileName());
		System.out.println(path.toAbsolutePath());
		System.out.println(path.toRealPath(LinkOption.NOFOLLOW_LINKS));
		
		//
		Path path2 = Paths.get("/Users/levent/javaworld/git/OCP8/OCP8Apress/log.txt");
		
		boolean isSameFile = Files.isSameFile(path, path2);
		System.out.println(path2);
		System.out.println(path2.getFileName());
		System.out.println(path2.getNameCount());
		System.out.println(path2.getName(0));
		System.out.println(path2.getName(6));
		System.out.println(path2.normalize());
		//
		System.out.println("equals: "+path.equals(path2));
		System.out.println("equals toAbsolutePath : "+path.toAbsolutePath().equals(path2));
		System.out.println(path.getClass());
		System.out.println("isSameFile : "+ isSameFile);
		//
		//
		Path path3 = Paths.get("/Users/levent/javaworld/git/OCP8/OCP8Apress/../log.txt");
		Path path4 = Paths.get("/Users/levent/javaworld/git/OCP8/OCP8Apress/../log.txt");
		System.out.println(path3);
		System.out.println(path3.normalize());
		System.out.println("equals:" + path3.equals(path4));
		//
		System.out.println("watch out Path IS-A Iterable");
		for(Path p : path3){
			System.out.println(p);
		}
		
		System.out.println("path5 and path6");
		Path path5  = Paths.get("./file.txt");
		Path path6  = Paths.get("./file.txt");
		System.out.println(path5.equals(path6));
		System.out.println(path5.compareTo(path6));
	}
}
