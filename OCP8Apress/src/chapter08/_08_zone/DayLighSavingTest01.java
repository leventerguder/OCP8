package chapter08._08_zone;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Set;
import java.util.function.Consumer;

public class DayLighSavingTest01 {

	public static void main(String[] args) {
		ZoneId defaultZone = ZoneId.systemDefault();
		Duration duration01 = defaultZone.getRules().getDaylightSavings(Instant.now());
		System.out.println(duration01.toHours());

		ZoneId kolkataZone = ZoneId.of("Asia/Kolkata");
		Duration kolkataDST = kolkataZone.getRules().getDaylightSavings(Instant.now());
		System.out.printf("Kolkata zone DST is: %d hours %n", kolkataDST.toHours());

		ZoneId aucklandZone = ZoneId.of("Pacific/Auckland");
		Duration aucklandDST = aucklandZone.getRules().getDaylightSavings(Instant.now());
		System.out.printf("Auckland zone DST is: %d hours", aucklandDST.toHours());

		Set<String> zones = ZoneId.getAvailableZoneIds();
 
		Consumer<String> consumer = (String zoneId) ->  {
			ZoneId zone = ZoneId.of("Pacific/Auckland");
			Duration dst = zone.getRules().getDaylightSavings(Instant.now());
			System.out.printf(zoneId + "zone DST is: %d hours", dst.toHours());
		};
		zones.forEach(consumer);
	}
}
