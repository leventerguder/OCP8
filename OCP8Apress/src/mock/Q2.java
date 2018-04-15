package mock;

import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;

public class Q2 {

	// The read() method returns -1 when the file reaches the end.
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File file = new File("txt");
		int ch = 0;
		try (FileReader inputFile = new FileReader(file)) {
			while ((ch = inputFile.read()) != -1) {
				System.out.print((char) ch);
			}
		}
	}

}
