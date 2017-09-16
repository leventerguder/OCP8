package chapter08._08_zone;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZoneOffsetTest01 {

	public static void main(String[] args) {

		ZoneId zoneHK = ZoneId.of("Asia/Hong_Kong");
		System.out.println(zoneHK);
		//
		LocalDateTime localTimeAtHK = LocalDateTime.now(zoneHK);
		System.out.println(localTimeAtHK);
		//
		ZonedDateTime zonedDateTime = localTimeAtHK.atZone(zoneHK);
		System.out.println(zonedDateTime);
		ZoneOffset zoneOffset = zonedDateTime.getOffset();
		System.out.println(zoneOffset);
		//
	}
}
// ZoneId identifies a time zone, such as Asia/Kolkata. Another class,
// ZoneOffset, represents the time-zone offset from UTC/Greenwich. For example,
// zone ID “Asia/Kolkata” has a zone offset of +05:30 (plus 5 hours and 30
// minutes) from UTC/Greenwich. The ZoneOffset class extends the ZoneId class.