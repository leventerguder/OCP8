package chapter10._08.stream;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test02FilesWalk {

	public static void main(String[] args) throws IOException {
		
		Files.walk(Paths.get(".")).forEach(System.out::println);
		
		System.out.println();
		Files.walk(Paths.get("."), 2, FileVisitOption.FOLLOW_LINKS).forEach(System.out::println);;
	}
}
