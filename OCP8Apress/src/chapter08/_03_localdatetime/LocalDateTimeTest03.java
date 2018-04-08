package chapter08._03_localdatetime;

import java.time.LocalDateTime;

public class LocalDateTimeTest03 {

	public static void main(String[] args) {
		
		LocalDateTime localDateTime = LocalDateTime.now();
		localDateTime = localDateTime.plusDays(2).plusHours(2);
		
		System.out.println(localDateTime);
	}
}
