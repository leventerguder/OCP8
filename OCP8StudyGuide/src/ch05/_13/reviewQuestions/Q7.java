package ch05._13.reviewQuestions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q7 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
		date.plusDays(2);
		// date.plusHours(3); //Compiler Error
		System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
	}
}
