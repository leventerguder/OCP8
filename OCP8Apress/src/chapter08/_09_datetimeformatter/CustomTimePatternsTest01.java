package chapter08._09_datetimeformatter;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CustomTimePatternsTest01 {

	public static void main(String[] args) {
		// patterns from simple to complex ones
		String[] timeFormats = {
				"h:mm", 
				"hh 'o''clock'",
				"H:mm a", "hh:mm:ss:SS", "K:mm:ss a"
		};
		LocalTime now = LocalTime.now();
		for (String timeFormat : timeFormats) {
			System.out.printf("Time in pattern \"%s\" is %s %n", timeFormat,
					DateTimeFormatter.ofPattern(timeFormat).format(now));
		}
	}
}
//• G (era: BC, AD)
//• y (year of era: 2015, 15)
//• Y (week-based year: 2015, 15)
//• M (month: 11, Nov, November)
//• w (week in year: 13)
//• W (week in month: 2)
//• E (day name in week: Sun, Sunday)
//• D (day of year: 256)
//• d (day of month: 13)

//a (marker for the text a.m./p.m. marker) 
//H (hour: value range 0–23)
//k (hour: value range 1–24)
//K (hour in a.m./p.m.: value range 0–11)
//h (hour in a.m./p.m.: value range 1–12) 
//m (minute
//s (second)
//S (fraction of a second)
//z (time zone: general time-zone format)
