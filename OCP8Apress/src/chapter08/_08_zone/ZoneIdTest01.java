package chapter08._08_zone;

import java.time.ZoneId;

public class ZoneIdTest01 {

	public static void main(String[] args) {
		
		ZoneId zoneId1 = ZoneId.of("Europe/Amsterdam");
		ZoneId zoneId2 = ZoneId.of("Europe/Istanbul");
		ZoneId zoneId3 = ZoneId.of("Asia/Istanbul");
		ZoneId zoneId4 = ZoneId.of("Europe/London");
		ZoneId zoneId5 = ZoneId.of("America/Argentina/Buenos_Aires");
		//
		System.out.println(zoneId1);
		System.out.println(zoneId2);
		System.out.println(zoneId3);
		System.out.println(zoneId4);
		System.out.println(zoneId5);
	}
}
