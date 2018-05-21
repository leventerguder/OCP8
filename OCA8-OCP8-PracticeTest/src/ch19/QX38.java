package ch19;

import static java.nio.file.StandardCopyOption.*;
import static java.nio.file.Files.*;
import java.io.*;
import java.nio.file.*;

public class QX38 {

	public void main(String[] items) throws Exception {
		final Path s = new File("apples.zip").toPath();
		final Path t = FileSystems.getDefault().getPath("oranges.zip");
		copy(s, t, REPLACE_EXISTING); // q1
		//copy(Files.newBufferedReader(t),t,ATOMIC_MOVE); // q2 //compile error
	}
}
