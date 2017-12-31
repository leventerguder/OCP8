package ch05._12.formattingDatesAndTimes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Test06Parse {

	public static void main(String[] args) {
		//
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate date = LocalDate.parse("01 02 2018", formatter);
		LocalTime time = LocalTime.parse("11:25");

		System.out.println(date);
		System.out.println(time);
	}
}
