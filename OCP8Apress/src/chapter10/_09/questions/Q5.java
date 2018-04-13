package chapter10._09.questions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class Q5 {

	public static void main(String[] args) throws IOException {

		BiPredicate<Path, BasicFileAttributes> predicate = (path, attrs) -> true;

		try (Stream<Path> entries = Files.find(Paths.get("."), 4, predicate)) {
			entries.forEach(System.out::println);
		}
	}
}
