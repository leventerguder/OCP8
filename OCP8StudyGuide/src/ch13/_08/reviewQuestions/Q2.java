package ch13._08.reviewQuestions;

import java.text.DecimalFormat;

public class Q2 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,000.0#");
		double pi = 3.141592653;
		System.out.println(df.format(pi));
		// 003.14

		// 0 means mandatory position
		// # means an optional position

		// The format says that there must be either
		// three or four digits before the decimal. Since we only have one, Java
		// uses the smaller number.
		// The format also says that there must be either one or two digits
		// after the decimal. Since
		// we have many digits, Java uses the larger number.
	}
}
