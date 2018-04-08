package chapter08._10_questions;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Q3 {

	public static void main(String[] args) {
		ZoneId zoneId = ZoneId.of("Asia/Singapore");
		ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), zoneId);
		System.out.println(zonedDateTime.getOffset());
	}
}
