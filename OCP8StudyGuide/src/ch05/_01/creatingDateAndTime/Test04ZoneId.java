package ch05._01.creatingDateAndTime;

import java.time.ZoneId;
import java.util.Set;

public class Test04ZoneId {

	public static void main(String[] args) {
		ZoneId systemDefault = ZoneId.systemDefault();
		System.out.println("systemDefault : " + systemDefault);
		//
		Set<String> zoneIds = ZoneId.getAvailableZoneIds();
		zoneIds.forEach(System.out::println);
	}
}
