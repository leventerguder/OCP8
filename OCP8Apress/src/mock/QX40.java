package mock;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class QX40 {

	public static void main(String[] args) {

		String srcFile = "src/mock/Hello.txt";
		String dstFile = "src/mock/World.txt";

		try (	BufferedReader inputFile = new BufferedReader(new FileReader(srcFile));
				BufferedWriter outputFile = new BufferedWriter(new FileWriter(dstFile))) { // TRY-BLOCK
			int ch = 0;
			while ((ch = inputFile.read()) != -1) { // COND-CHECK
				outputFile.write((char) ch);
			}
		} catch (Exception exception) {
			System.err.println("Error in opening or processing file " + exception.getMessage());
		}
	}

}
