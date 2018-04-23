package ch05._04.duration;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Test02DurationChronoUnit {

	public static void main(String[] args) {
		Duration daily = Duration.of(1, ChronoUnit.DAYS);
		Duration hourly = Duration.of(1, ChronoUnit.HOURS);
		Duration everyMinute = Duration.of(1, ChronoUnit.MINUTES);
		Duration everyTenSecond = Duration.of(10, ChronoUnit.SECONDS);
		Duration everyMilli = Duration.of(1, ChronoUnit.MILLIS);
		Duration everyNano = Duration.of(1, ChronoUnit.NANOS);
		Duration halfDay = Duration.of(1, ChronoUnit.HALF_DAYS);
		//Duration decades = Duration.of(1, ChronoUnit.DECADES); //
		//java.time.temporal.UnsupportedTemporalTypeException: Unit must not have an estimated duration

		
		System.out.println(daily);
		System.out.println(hourly);
		System.out.println(everyMinute);
		System.out.println(everyTenSecond);
		System.out.println(everyMilli);
		System.out.println(everyNano);
		System.out.println(halfDay);
		//System.out.println(decades);
		
//		PT24H
//		PT1H
//		PT1M
//		PT10S
//		PT0.001S
//		PT0.000000001S
//		PT12H

	}
}
