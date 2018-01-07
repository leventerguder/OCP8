package ch09._06.files.attributes;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test03FilesSize {

	public static void main(String[] args) throws IOException {

		Path f1 = Paths.get("size.txt");

		BufferedWriter bw = Files.newBufferedWriter(f1);
		bw.write("line1\nline2\nline3");
		bw.close();

		long size = Files.size(f1);
		System.out.println(size);

	}
}
