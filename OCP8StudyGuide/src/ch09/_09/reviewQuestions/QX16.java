package ch09._09.reviewQuestions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class QX16 {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("/squid/food-schedule.csv");
		Files.lines(path) // r1
				.flatMap(p -> Stream.of(p.split(","))).map(s -> ((String) s).toUpperCase()).forEach(System.out::println);
	}
}
