package chapter08._03_localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest02 {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDate localDate = localDateTime.toLocalDate();
		LocalTime localTime = localDateTime.toLocalTime();
		
		System.out.println(localDateTime);
		System.out.println(localDate);
		System.out.println(localTime);
	}

}
