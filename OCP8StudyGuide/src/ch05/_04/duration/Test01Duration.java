package ch05._04.duration;

import java.time.Duration;

public class Test01Duration {

	public static void main(String[] args) {
		// For Duration, you can specify the number of days, hours, minutes,
		// seconds, or nanoseconds.

		// Duration doesn’t have a constructor that takes multiple units like
		// Period does.
		Duration daily = Duration.ofDays(1); // PT24H
		Duration _360 = Duration.ofDays(360); // PT8640H
		Duration hourly = Duration.ofHours(1); // PT1H
		Duration everyMinute = Duration.ofMinutes(1); // PT1M
		Duration _60Minute = Duration.ofMinutes(60); // PT1H
		Duration _61Minute = Duration.ofMinutes(61); // PT1H1M
		Duration everyTenSecond = Duration.ofSeconds(10); // PT10S
		Duration anHour = Duration.ofSeconds(3600); // PT1H
		Duration everyMilli = Duration.ofMillis(1); // PT0.001S
		Duration everyNano = Duration.ofNanos(1); // PT0.000000001S

		// PT ->Period of Time
		// H
		// M
		// S
		System.out.println(daily);
		System.out.println(_360);
		System.out.println(hourly);
		System.out.println(everyMinute);
		System.out.println(_60Minute);
		System.out.println(_61Minute);
		System.out.println(everyTenSecond);
		System.out.println(anHour);
		System.out.println(everyMilli);
		System.out.println(everyNano);

		// Days -> Hour
		// Minute -> Hour
		// Milli , Nano -> Second

	}
}