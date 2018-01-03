package ch08._01.reviewQuestions;

import java.io.Console;
import java.io.IOException;
import java.io.Writer;

public class Q5 {

	public static void main(String[] args) throws IOException {
		String line;
		Console c = System.console();
		Writer w = c.writer();
		if ((line = c.readLine()) != null)
			w.append(line);
		w.flush();
	}
}

//A. The code runs without error but prints nothing.
//B. The code prints what was entered by the user. (true)
//C. An ArrayIndexOutOfBoundsException might be thrown. 
//D. A NullPointerException might be thrown.(true)
//E. An IOException might be thrown. (true)
//F. The code does not compile.