package chapter08._01_localdate;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;

public class LocalDateTest03 {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now(Clock.systemDefaultZone());

		System.out.println(today);

		LocalDate tokyoToday = LocalDate.now(ZoneId.of("Asia/Tokyo"));

		System.out.println(tokyoToday);

	}

}
