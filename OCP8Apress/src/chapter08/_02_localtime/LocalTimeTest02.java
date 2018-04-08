package chapter08._02_localtime;

import java.time.LocalTime;

public class LocalTimeTest02 {

	public static void main(String[] args) {

		LocalTime localTime = LocalTime.of(20, 45);
		localTime.plusHours(5);
		System.out.println(localTime); // LocalTime is immutable!!

		localTime = localTime.plusHours(5);

		System.out.println(localTime);

		//
		// plusHours
		// plusMinutes
		// plusSeconds
		// plusNanos
		// minusHours
		// minusMinutes
		// minusSecond
		// minusNanos
	}
}
