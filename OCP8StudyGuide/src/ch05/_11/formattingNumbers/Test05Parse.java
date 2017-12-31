package ch05._11.formattingNumbers;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Test05Parse {

	public static void main(String[] args) throws ParseException {
		String annualSalary = "$92,807.99";
		NumberFormat cf = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
		double value = (Double) cf.parse(annualSalary);
		System.out.println(value); // 92807.99
	}

}
