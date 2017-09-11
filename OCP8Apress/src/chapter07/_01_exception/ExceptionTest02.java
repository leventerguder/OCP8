package chapter07._01_exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionTest02 {

	{
		FileReader fr = new FileReader("f.txt");
		fr.read();
	}

	public ExceptionTest02() throws IOException {
		// Non-static initialization blocks can throw checked exceptions;
		// however, all the constructors should declare those exceptions in
		// their throws clause. Why? The compiler merges the code for non-static
		// initialization blocks and constructors during its code generation
		// phase, hence the throws clause of the constructor can be used for
		// declaring the checked exceptions that a non-static initialization
		// block can throw.
	}
}