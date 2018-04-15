package mock;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class QX60 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("src/mock/names.txt"));
		System.out.println(br.readLine());
		br.mark(100); // MARK
		System.out.println(br.readLine());
		br.reset(); // RESET
		System.out.println(br.readLine());
	}
}

// The method void mark(int limit) in BufferedReader marks the current position
// for resetting the stream to the marked position. The argument limit specifies
// the number of characters that may be read while still preserving the mark.
// This code segment marks the position after “olivea” is read, so after reading
// “emma,” when the marker is reset and the line is read again, it reads “emma”
// once again.