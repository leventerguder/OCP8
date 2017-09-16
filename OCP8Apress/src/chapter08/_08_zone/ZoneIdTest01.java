package chapter08._08_zone;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdTest01 {

	public static void main(String[] args) {
		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println(zoneId);
		//
		
		Set<String> zones = ZoneId.getAvailableZoneIds();
		System.out.println(zones.size());
		zones.forEach(System.out::println);
	}
}
// In the java.time package, the java.time.ZoneId class represents time zones.
// Time zones are typically identified using an offset from Greenwich Mean Time
// (GMT, also known as UTC/Greenwich).