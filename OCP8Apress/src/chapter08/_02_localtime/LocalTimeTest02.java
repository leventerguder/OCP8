package chapter08._02_localtime;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeTest02 {

	public static void main(String[] args) {
		LocalTime currentTime = LocalTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println(currentTime);

		// 24 hour -> 86400 seconds
		//
		LocalTime after3000Seconds = LocalTime.ofSecondOfDay(3000);
		System.out.println(after3000Seconds);
		
		//
		
		LocalTime parsedTime = LocalTime.parse("18:48:05");
		System.out.println(parsedTime);
	}
}
