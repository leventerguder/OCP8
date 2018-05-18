package ch17;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class QX22 {

	public static void main(String[] args) {

		LocalDate montyPythonDay = LocalDate.of(2017, Month.MAY, 10);
		LocalTime time = LocalTime.of(5, 40);
		LocalDateTime dateTime = LocalDateTime.of(montyPythonDay, time);

		Duration duration = Duration.ofDays(1);
		LocalDateTime result = dateTime.minus(duration);
		System.out.println(result);
		// 2017-05-09T05:40
	}
}
