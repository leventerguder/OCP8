package mock;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class QX39 {

	public static void main(String[] args) throws IOException {
				
		
		String srcFile = "src/mock/Hello.txt";
		String dstFile = "src/mock/World.txt";

		try (BufferedReader inputFile = new BufferedReader(new FileReader(srcFile));
				BufferedWriter outputFile = new BufferedWriter(new FileWriter(dstFile))) {
			int ch = 0;
			inputFile.skip(6);
			while ((ch = inputFile.read()) != -1) {
				outputFile.write((char) ch);
			}
			outputFile.flush();
		} catch (IOException exception) {
			System.err.println("Error " + exception.getMessage());
		}
	}
}

//The program will result in creating the file World.txt with the contents "World!" in it