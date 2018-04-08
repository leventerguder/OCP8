package chapter08._08_zone;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Set;

public class ZoneIdTest02 {

	public static void main(String[] args) {
		//
		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println(zoneId);
		//

		Set<String> zones = ZoneId.getAvailableZoneIds();
		System.out.println(zones.size());

		zones.forEach(zone ->
		{
			LocalTime localTime = LocalTime.now(ZoneId.of(zone));
			System.out.println(zone + " | " + localTime);
		});

	}
}
// In the java.time package, the java.time.ZoneId class represents time zones.
// Time zones are typically identified using an offset from Greenwich Mean Time
// (GMT, also known as UTC/Greenwich).