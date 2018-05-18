package ch17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class QX19 {

	public static void main(String[] args) {

		LocalDate polarBearDay = LocalDate.of(2017, 2, 27);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy dd MMM");
		System.out.println(polarBearDay.format(formatter));

		// 2017 27 Feb
	}

}
