package ch06._02.multiCatch;

import java.io.FileReader;
import java.io.IOException;

public class Test02MultiCatch {

	public static void main(String[] args) {

		// catch(Exception1 e | Exception2 e) { .... } //Compiler error!
		// catch(Exception1 e1 | Exception2 e2) { .... } //Compiler error!
		// catch(FileNotFoundException | IOException e) { .... } //Compiler error!
		// catch(Exception1 | Exception2 e) {} // VALID
		try {
			FileReader fr = new FileReader("file.txt");
			fr.read();
		} catch (IOException | RuntimeException e) {
			System.out.println(e.getClass());

			// multi catch is effectivelly final
			// e = new RuntimeExcetpion(); //not legal for multi catch
		}
	}
}
