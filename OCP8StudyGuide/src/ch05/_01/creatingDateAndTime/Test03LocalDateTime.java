package ch05._01.creatingDateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test03LocalDateTime {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();

		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		//
		LocalDateTime ldt2 = LocalDateTime.of(date, time);

		LocalDateTime ldt3 = LocalDateTime.of(2017, 12, 26, 22, 00);
		LocalDateTime ldt4 = LocalDateTime.of(2017, 12, 26, 22, 00, 50);

		System.out.println(ldt);
		System.out.println(ldt2);
		System.out.println(ldt3);
		System.out.println(ldt4);

	}
}
