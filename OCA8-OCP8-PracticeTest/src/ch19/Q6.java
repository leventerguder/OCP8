package ch19;

import java.io.*;
import java.nio.file.*;

public class Q6 {
	
	// What is the result of compiling and executing the following program? Assume
	// the current directory is /stock and the path /stock/sneakers does not exist
	// prior to execution.	

	public void setupInventory(Path desiredPath) throws Exception {
		Path suggestedPath = Paths.get("sneakers");
		if (Files.isSameFile(suggestedPath, desiredPath) // j1 //java.nio.file.NoSuchFileException
				&& !Files.exists(suggestedPath))
			Files.createDirectories(desiredPath); // j2
	}

	public static void main(String[] socks) throws Exception {
		Path w = new File("/stock/sneakers").toPath(); // j3
		new Q6().setupInventory(w);
	}
	
	// A. The directory /stock/sneakers is created.
}
