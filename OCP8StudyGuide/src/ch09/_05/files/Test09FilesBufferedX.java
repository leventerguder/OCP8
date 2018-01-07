package ch09._05.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test09FilesBufferedX {

	public static void main(String[] args) throws IOException {

		Path file = Paths.get("buffered.txt");

		try (BufferedWriter bw = Files.newBufferedWriter(file)) {
			bw.write("line1\nline2\nline3");
		}

		try (BufferedReader br = Files.newBufferedReader(file)) {
			String currentLine = null;
			while ((currentLine = br.readLine()) != null) {
				System.out.println(currentLine);
			}
		}
	}
}
