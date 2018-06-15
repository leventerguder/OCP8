package ch13._02.formattingAndParsing;

import java.text.DecimalFormat;

public class Test01DecimalFormat {

	public static void main(String[] args) {

		double d = 1234567.437;
		DecimalFormat one = new DecimalFormat("###,###,###.###");
		System.out.println(one.format(d));
		
		DecimalFormat two = new DecimalFormat("000,000,000.00000");
		System.out.println(two.format(d));
		
		DecimalFormat three = new DecimalFormat("$#,###,###.##");
		System.out.println(three.format(d));
	}
}
