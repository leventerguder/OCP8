package chapter08._06_duration;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
	// Duration is the time equivalent of Period. The Duration class represents
	// time in terms of hours, minutes, seconds, and so
	
	public static void main(String[] args) {
		LocalDateTime comingMidnight = LocalDateTime.of(LocalDate.now().plusDays(1), LocalTime.MIDNIGHT);
		LocalDateTime now = LocalDateTime.now();
		
		Duration between = Duration.between(now, comingMidnight);
		
		System.out.println(comingMidnight);
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.MIDNIGHT);
		
		System.out.println(between);
		System.out.println(between.getSeconds());
		System.out.println(between.getNano());
		
		
	}
}
