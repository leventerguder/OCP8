package ch05._04.duration;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test05Duration {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2015, 1, 20);
		LocalTime time = LocalTime.of(6, 15);
	
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		//
		Duration duration = Duration.ofHours(6);
		System.out.println(duration);
		
		System.out.println(time.plus(duration));
		System.out.println(dateTime.plus(duration));
		
		//System.out.println(date.plus(duration));
		//Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Seconds
	}
}
