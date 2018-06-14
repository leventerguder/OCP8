package ch13._05.directoryStream;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test01DirectoryStream {

	// java.nio.file.DirectoryStream
	// DirectoryStream interface does not extend the java.util.stream.Stream
	// interface.
	// DirectoryStream is unrelated to Stream API !

	// DirectoryStream interface can be used to iterate over a directory ,
	// similar to the java.io.File.listFiles() method

	// DirectoryStream process traverses only a single directory and does not
	// visit any sub directories !
	
	public static void main(String[] args) throws IOException {

		Path path = Paths.get(".");
		DirectoryStream<Path> ds = Files.newDirectoryStream(path);
		//
		ds.forEach(System.out::println);
		//
		
		try(DirectoryStream<Path> ds2 = Files.newDirectoryStream(path)){
			
		}
		
	}

}
