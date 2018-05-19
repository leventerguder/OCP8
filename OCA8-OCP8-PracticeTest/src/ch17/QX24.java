package ch17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class QX24 {

	// LocalDateTime.of() has a number of overloads. Which of the following is
	// not one
	// of them?
	//
	// A. LocalDateTime.of(LocalDate date, LocalTime time)
	// B. LocalDateTime.of(LocalDate date, int hour, int minute) (+)
	// C. LocalDateTime.of(int year, int month, int day, int hour, int minute)
	// D. LocalDateTime.of(int year, Month month, int day, int hour, int minute)

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
		//
		// LocalDateTime.of(localDate, 10, 20); //compile error
	}
}
