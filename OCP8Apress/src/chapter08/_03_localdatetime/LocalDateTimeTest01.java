package chapter08._03_localdatetime;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeTest01 {

	public static void main(String[] args) {
		//
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println(currDateTime);
		// In this output, note that the character T stands for time, and it
		// separates the date and time components.

		//
		LocalDateTime localDateTime = LocalDateTime.of(2018, Month.JUNE, 18, 20, 45, 50);
		System.out.println(localDateTime);
	}
}
