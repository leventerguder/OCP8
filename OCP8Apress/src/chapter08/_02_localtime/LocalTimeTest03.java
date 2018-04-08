package chapter08._02_localtime;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeTest03 {

	public static void main(String[] args) {
		//
		LocalTime currentTimeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
		LocalTime currentTimeInParis = LocalTime.now(ZoneId.of("Europe/Paris"));

		System.out.println(currentTimeInTokyo);
		System.out.println(currentTimeInParis);
	}
}
