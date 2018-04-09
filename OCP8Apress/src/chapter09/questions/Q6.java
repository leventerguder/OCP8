package chapter09.questions;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Q6 {

	public static void main(String[] args) throws Exception {
		FileInputStream findings = new FileInputStream("log.txt");
		DataInputStream dataStream = new DataInputStream(findings);
		BufferedReader br = new BufferedReader(new InputStreamReader(dataStream));
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
			br.close();
		}
	}
}

// The br.close() statement will close the BufferedReader object and the
// underlying stream objects referred by findings and dataStream.

// The readLine() method invoked in the statement br.readLine() can throw an
// IOException; if this exception is thrown, br.close() will not be called,
// resulting in a resource leak.
