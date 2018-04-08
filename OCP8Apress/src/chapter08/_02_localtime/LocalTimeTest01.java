package chapter08._02_localtime;

import java.time.LocalTime;

public class LocalTimeTest01 {

	public static void main(String[] args) {
		//
		LocalTime currentTime = LocalTime.now();
		LocalTime localTime1 = LocalTime.of(20, 30);
		LocalTime localTime2 = LocalTime.of(20, 30, 50, 15550);

		System.out.println("currentTime : " + currentTime);
		System.out.println("localTime1 : " + localTime1);
		System.out.println("localTime2 : " + localTime2);
		
	}
}
