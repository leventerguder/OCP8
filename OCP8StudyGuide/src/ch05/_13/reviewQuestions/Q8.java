package ch05._13.reviewQuestions;

import java.time.LocalDate;
import java.time.Month;

public class Q8 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
		// java.time.DateTimeException: Invalid value for DayOfMonth (valid
		// values 1 - 28/31): 40
		System.out.println(date.getYear() + " " + date.getDayOfMonth());
	}
}
