package ch09._05.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test05FilesCopy {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("source-data.txt");
		fw.write("sample data");
		fw.close();
		//

		Path path1 = Paths.get("copied-data.txt");
		try (InputStream is = new FileInputStream("source-data.txt")) {

			if (!Files.exists(path1)) {
				long result = Files.copy(is, path1);
				System.out.println(result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (OutputStream os = new FileOutputStream("output-copied-data.txt")) {
			long result = Files.copy(path1, os);
			System.out.println(result);
		}

	}
}
