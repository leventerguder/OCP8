package ch05._01.creatingDateAndTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test05ZonedDateTime {

	public static void main(String[] args) {
		
		
		//
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime zdt2 = ZonedDateTime.now(zone);
		System.out.println(zdt2);
		
		//
		ZoneId zone2 = ZoneId.of("Europe/Paris");
		
		LocalDateTime ldt = LocalDateTime.now(zone2);
		ZonedDateTime zdt3 = ZonedDateTime.of(ldt , zone2);
		System.out.println(zdt3);
		
	}
}
