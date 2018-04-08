package chapter08._02_localtime;

import java.time.LocalTime;

public class LocalTimeTest04 {

	public static void main(String[] args) {

		// 24 hour -> 86400 seconds
		//
		LocalTime after3000Seconds = LocalTime.ofSecondOfDay(3000);
		System.out.println(after3000Seconds);
		
		// 1 second -> 10ˆ9 nano 1_000_000_000
		LocalTime after1_000_000_001Nanos = LocalTime.ofNanoOfDay(1_000_000_001);
		System.out.println(after1_000_000_001Nanos);

	}
}
