package chapter08._02_localtime;

import java.time.LocalTime;

public class LocalTimeTest05 {

	public static void main(String[] args) {

		LocalTime parsedTime = LocalTime.parse("18:48:05");
		System.out.println(parsedTime);
	}

}
