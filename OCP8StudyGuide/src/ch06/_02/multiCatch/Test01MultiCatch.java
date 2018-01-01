package ch06._02.multiCatch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Test01MultiCatch {

	public static void main(String[] args) {

		try {
			Path path = Paths.get("file.txt");
			String text = new String(Files.readAllBytes(path));
			LocalDate date = LocalDate.parse(text);

			// duplicate!

		} catch (DateTimeParseException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

		// ---------------------------------------
		try {
			Path path = Paths.get("file.txt");
			String text = new String(Files.readAllBytes(path));
			LocalDate date = LocalDate.parse(text);

			// Bad approach

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

		// ---------------------------------------

		try {
			Path path = Paths.get("file.txt");
			String text = new String(Files.readAllBytes(path));
			LocalDate date = LocalDate.parse(text);

			// multi catch !
			// There’s no duplicate code, the common logic is all in one place,
			// and the logic is exactly where we would expect to nd it

		} catch (DateTimeParseException | IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}

}
