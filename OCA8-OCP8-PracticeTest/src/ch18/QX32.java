package ch18;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class QX32 {

	public static void main(String[] args) throws IOException {
		File cake = new File("cake.txt");
		Writer pie = new FileWriter("pie.txt");
		pie.flush();
		new File("fudge.txt").mkdirs();
	}
}
