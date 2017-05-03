package _09.date.api;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedTest {

	public static void main(String[] args) {
		ZoneId id = ZoneId.of("Europe/Paris");
		System.out.println(id);

		ZoneId currentZone = ZoneId.systemDefault();
		System.out.println(currentZone);

		ZonedDateTime date1 = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
		System.out.println("date1: " + date1);
	}
}
