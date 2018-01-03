package ch08._01.reviewQuestions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class QX15 {

	private void echo() throws IOException {
		try (FileReader fileReader = new FileReader("zoo-data.txt");
				BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			System.out.println(bufferedReader.readLine());
		}
	}
}

// A. It prints the first line of the file to the console.