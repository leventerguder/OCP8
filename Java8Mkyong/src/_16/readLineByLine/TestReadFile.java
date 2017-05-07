package _16.readLineByLine;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TestReadFile {

	public static void main(String[] args) {
		String fileName = "lines.txt";

		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			stream.forEach(System.out::println);
		} catch (Exception e) {

		}

	}
}
