package chapter10._08.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Test05FilesLines {

	public static void main(String[] args) throws IOException {
		try(Stream<String> lines = Files.lines(Paths.get("log.txt"))){
			lines.forEach(System.out::println);
		}
	}
}
