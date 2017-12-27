package ch05._04.duration;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test06Duration {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2015, 1, 20);
		LocalTime time = LocalTime.of(6, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		//
		Duration duration = Duration.ofHours(23);
		System.out.println(dateTime.plus(duration)); // 2015-01-21T05:15 ->
														// watch out next day!
		System.out.println(time.plus(duration));

		/*
		 * This time we see that Java moves forward past the end of the day.
		 * LocalDate goes to the next day since we pass midnight. LocalTime
		 * doesn’t have a day, so the time just wraps around—just like on a real
		 * clock.
		 */

	}
}
