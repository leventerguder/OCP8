package ch03._02.generics;

import java.io.FileNotFoundException;

public class Helper {

	public static <U extends Exception> void printException(U u) {
		System.out.println(u.getMessage());
	}

	public static void main(String[] args) {
		Helper.printException(new FileNotFoundException("A"));
		Helper.printException(new Exception());
		Helper.<NullPointerException>printException(new NullPointerException());
	}

}
