package chapter08._08_zone;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeDifferenceTest01 {

	public static void main(String[] args) {
		ZoneId singaporeZone = ZoneId.of("Asia/Singapore");
		ZonedDateTime dateTimeInSingapore = ZonedDateTime.of(LocalDateTime.of(2018, Month.JANUARY, 1, 6, 0),
				singaporeZone);

		System.out.println(dateTimeInSingapore);
		//

		ZoneId aucklandZone = ZoneId.of("Pacific/Auckland");
		ZonedDateTime sameDateTimeInAuckland = dateTimeInSingapore.withZoneSameInstant(aucklandZone);

		System.out.println(sameDateTimeInAuckland);
		//

		Duration timeDifference = Duration.between(dateTimeInSingapore.toLocalTime(),
				sameDateTimeInAuckland.toLocalTime());
		System.out.printf("Time difference between %s and %s zones is %d hours", singaporeZone, aucklandZone,
				timeDifference.toHours());
	}
}
