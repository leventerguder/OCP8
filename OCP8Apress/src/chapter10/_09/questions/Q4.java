package chapter10._09.questions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Q4 {

	public static void main(String[] args) throws IOException {
		Stream<String> lines = Files.lines(Paths.get("log.txt"));
		lines.limit(1).forEach(System.out::println);
		lines.close();
	}
}
