package ch05._01.creatingDateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test05ZonedDateTime2 {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		ZoneId zId = ZoneId.systemDefault();
		//
		ZonedDateTime zdt = ZonedDateTime.of(localDate, localTime, zId);
		System.out.println(zdt);
		//

		LocalDateTime ldt = LocalDateTime.now(ZoneId.of("Europe/Paris"));
		ZonedDateTime zdt2 = ZonedDateTime.of(ldt, ZoneId.of("Europe/Paris"));

		System.out.println(zdt2);

	}
}
