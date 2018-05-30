package ch23;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class QX46 {

	// Bill wants to create a program that reads all of the lines of all of his
	// books using NIO.2. Unfortunately, Bill may have made a few mistakes
	// writing
	// his program. How many lines of the following class contain compilation
	// errors?

	public static void main(String[] args) {
		
		//Path p = Paths.get("collection"); //compile error
		// Not Path.get !
		// Paths.get
		//new QX46().read(p);
	}

	public void readFile(Path p) {
		try {
			// public static List<String> readAllLines(Path path) throws IOException {
			//Files.readAllLines(p).paralel().forEach(System.out::println); //compile error
		} catch (Exception e) {

		}
	}
	
	public void read(Path directory) throws Exception{
		
		// Files.walk(directory).filter(p-> File.isRegularFile(p)).forEach(x -> readFile(x)); 
		//compile error not File ! It must be Files!
		
	}
	

}
