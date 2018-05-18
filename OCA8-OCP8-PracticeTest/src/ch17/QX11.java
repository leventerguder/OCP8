package ch17;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;

public class QX11 {

	public static void main(String[] args) {
		//
		LocalDate montyPythonDay = LocalDate.of(2017, Month.MAY, 10);
		LocalDate aprilFools = LocalDate.of(2018, Month.APRIL, 1);
		Duration duration = Duration.ofDays(1);
		LocalDate result = montyPythonDay.minus(duration);
		//  java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Seconds

		// D. None of the above
		
		System.out.println(result + " " + aprilFools.isBefore(result));
	}
}
