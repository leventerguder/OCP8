package _09.date.api;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class InstantTest {

	public static void main(String[] args) {

		Date current = new Date();
		System.out.println(current);
		//
		Instant now = current.toInstant();
		ZoneId currentZone = ZoneId.systemDefault();

		System.out.println(now);
		System.out.println(currentZone);
		
		//
		LocalDateTime ldate = LocalDateTime.ofInstant(now, currentZone);
		System.out.println(ldate);
	}
}
