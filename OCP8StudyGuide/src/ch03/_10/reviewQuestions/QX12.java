package ch03._10.reviewQuestions;

import java.io.FileNotFoundException;

public class QX12 {

}

class Helper {
	public static <U extends Exception> void printException(U u) {
		System.out.println(u.getMessage());
	}

	public static void main(String[] args) {
		//
		Helper.printException(new FileNotFoundException("A"));
		Helper.printException(new Exception("B"));
		Helper.<NullPointerException>printException(new NullPointerException("D"));
	}
}