package chapter08._02_localtime;

import java.time.LocalTime;

public class LocalTimeTest01 {

	public static void main(String[] args) {
		//
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		//
		System.out.println(LocalTime.of(18, 30));

		//
		// plusHours
		// plusMinutes
		// plusSeconds
		//
		
		LocalTime currentTime2 = LocalTime.now();
		currentTime2 = currentTime2.plusHours(2);
		
		System.out.println(currentTime2);
	}
}
