package chapter10._08.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Test01FilesList {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Example 1");
		
		try (Stream<Path> entries = Files.list(Paths.get("."))) {
			entries.forEach(System.out::println);
		}

		System.out.println("Example 2");
		Files.list(Paths.get(".")).map(p -> p.toAbsolutePath().normalize()).forEach(System.out::println);

//		//
//		System.out.println("Old way");
//		File file = new File(".");
//		File[] fileListOldWay = file.listFiles();
//		for(File f : fileListOldWay){
//			System.out.println(f.getAbsolutePath());
//		}
	}
}
