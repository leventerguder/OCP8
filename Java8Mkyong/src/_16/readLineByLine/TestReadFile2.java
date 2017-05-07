package _16.readLineByLine;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestReadFile2 {

	public static void main(String[] args) {
		String fileName = "lines.txt";
		List<String> list = new ArrayList<>();

		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			list = stream.filter(line -> !line.startsWith("line3")).map(String::toUpperCase)
					.collect(Collectors.toList());

		} catch (Exception e) {
		}

		list.forEach(System.out::println);
	}
}
