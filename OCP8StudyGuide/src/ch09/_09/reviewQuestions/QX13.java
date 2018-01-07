package ch09._09.reviewQuestions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Collectors;

public class QX13 {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/monkeys");
		Files.find(path, 0, (p, a) -> a.isSymbolicLink()).map(p -> p.toString()) // y1
				.collect(Collectors.toList()) // y2
				.stream() // y3
				.filter(x -> x.toString().endsWith(".txt")).forEach(System.out::println);
	}
}

// Assume /monkeys exists as a regular directory containing multiple files,
// symbolic links, and subdirectories. What is true about the following code?
// (Choose all that apply.)

// A. It will print all symbolic links in the directory tree ending in .txt.

// The key here is that the depth parameter specified as the second argument to
// find() is 0, meaning the only record that will be searched is the top- level
// directory. Since we know that the top directory is regular and not a symbolic
// link, no other paths will be visited and nothing will be printed.