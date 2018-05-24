package ch19;

import java.io.BufferedReader;
import java.io.Writer;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class QX13 {
	//
	public static void copy(Path source, Path target) throws Exception {
		//
		try (BufferedReader r = Files.newBufferedReader(source); Writer w = Files.newBufferedWriter(target)) {
			String temp = null;
			while ((temp = r.readLine()) != null) {
				w.write(temp);
			}
		}
	}

	public static void main(String[] args) throws Throwable {
		QX13.copy(Paths.get("/original.txt"), FileSystems.getDefault().getPath("/", "unoriginal.txt"));
	}
}

//	Which statement about the following class is correct?
//A. The class compiles without issue. (+)
//B. The class never throws an exception at runtime.
//C. The implementation correctly copies a regular file.
//D. All of the above
