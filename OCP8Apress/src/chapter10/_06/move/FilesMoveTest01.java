package chapter10._06.move;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesMoveTest01 {

	public static void main(String[] args) throws IOException {
		//
		Path p1 = Paths.get("move.txt");
		if (!Files.exists(p1))
			Files.createFile(p1);
		PrintWriter pw = new PrintWriter("move.txt");
		pw.println("line1");
		pw.println("line2");
		pw.close();

		Path path2 = Paths.get("movedFile.txt");
		Files.move(p1, path2, StandardCopyOption.REPLACE_EXISTING);
	}
}
