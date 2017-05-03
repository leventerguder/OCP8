package _09.date.api;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodDurationTest {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);

		LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS);
		
		Period p = Period.between(date2, date1);
		System.out.println(p);
	
		LocalTime time1 = LocalTime.now();
		Duration twoHours = Duration.ofHours(2);
		
		LocalTime time2 = time1.plus(twoHours);
		Duration duration = Duration.between(time2, time1);
		System.out.println(duration);
	
	}
}
