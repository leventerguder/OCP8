package ch06._03.tryWithResources;

import java.util.Scanner;

public class Test02TryWithResources {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in);) { // ; not required if just one resource
			s.nextLine();
		} catch (Exception e) {
			//s.hasNext(); // COMPILER ERROR , not visible
			// The problem is that Scanner has gone out of scope at the end of
			// the try clause.
		}finally {
			//s.hasNext(); // COMPILER ERROR , not visible
		}
	}
}
