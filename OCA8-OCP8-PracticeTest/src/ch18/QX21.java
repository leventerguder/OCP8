package ch18;

import java.io.*;

public class QX21 {

	public static void main(String[] args) {

		try (ObjectInputStream ios = new ObjectInputStream(new FileInputStream(new File("")))) {
			Student record;
			while ((record = (Student) ios.readObject()) != null) {
				System.out.print(record);
			}
		} catch (EOFException e) {

		} catch (Exception e) {
		}

		// The program runs and prints all students in the file.
	}
}

class Student implements Serializable {
}
