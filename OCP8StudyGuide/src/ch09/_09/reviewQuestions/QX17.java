package ch09._09.reviewQuestions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class QX17 {

	public static void main(String[] args) throws IOException {

		Files.walk(Paths.get("..").toRealPath().getParent()).map(p -> p.toAbsolutePath().toString())
				.filter(s -> s.endsWith(".java")).collect(Collectors.toList()).forEach(System.out::println);
	}
}
