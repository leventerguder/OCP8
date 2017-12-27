package ch05._04.duration;

import java.time.Duration;

public class Test01Duration {

	public static void main(String[] args) {
		Duration daily = Duration.ofDays(1); // PT24H
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
		System.out.println(_60Minute);
		System.out.println(_61Minute);
		System.out.println(anHour);

		// Days -> Hour
		// Minute -> Hour
		// Milli , Nano -> Second

	}
}