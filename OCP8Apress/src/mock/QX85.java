package mock;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class QX85 {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("file.txt");
		Stream<String> lines = Files.lines(path);
		lines.forEach(System.out::println);

		List<String> lines2 = Files.readAllLines(path);
		lines.forEach(System.out::println);
		
		lines.close();
		
	}
}
