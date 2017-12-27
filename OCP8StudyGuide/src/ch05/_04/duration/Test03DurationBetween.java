package ch05._04.duration;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.Temporal;

public class Test03DurationBetween {

	public static void main(String[] args) {
		LocalTime start = LocalTime.of(5, 15);
		LocalTime end = LocalTime.of(6, 25);

		// Duration # public static Duration between(Temporal startInclusive, Temporal endExclusive) 
		Duration between = Duration.between(start, end);
		Duration between2 = Duration.between(end, start);
		System.out.println(between); // PT1H10M
		System.out.println(between2); // PT-1H-10M

		LocalDate startDay = LocalDate.of(2016, Month.JANUARY, 30);
		LocalDate startEnd = LocalDate.of(2016, Month.FEBRUARY, 25);

		// Period#  public static Period between(LocalDate startDateInclusive, LocalDate endDateExclusive) 
		Period p1 = Period.between(startDay, startEnd);
		Period p2 = Period.between(startEnd, startDay);
		System.out.println(p1); // P26D
		System.out.println(p2); // P-26D
		
		
		Duration between3 = Duration.between(startDay, startEnd);
		System.out.println(between3);
	
		//Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Seconds
		

	}
}
