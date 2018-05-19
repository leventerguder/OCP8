package ch18;

import java.io.File;
import java.util.stream.Stream;

public class QX25 {

	public void deleteTree(File f) {
		if (!f.isDirectory())
			f.delete();
		else {
			// Stream.of(f.list()).forEach(s -> deleteTree(s)); //compile error
			// f.deleteDirectory();
		}
	}
}
